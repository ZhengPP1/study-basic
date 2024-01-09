package com.bingbing.designpatterns.observer.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author bingbing
 */
public class Client {

    public static void main(String[] args) {
        // 被观察者
        ISubject<String> observable = new ConcreteSubject<>();
        // 观察者
        IObserver<String> observer = new ConcreteObserver();
        // 注册
        observable.attach(observer);

        observable.notify("hello");

    }


    interface IObserver<E> {
        void update(E event);
    }


    public interface ISubject<E> {
        boolean attach(IObserver<E> observer);

        boolean detach(IObserver<E> observer);

        void notify(E event);

    }

    static class ConcreteObserver<E> implements IObserver<E> {


        @Override
        public void update(Object event) {
            System.out.println("receive event:" + event);
        }
    }


    static class ConcreteSubject<E> implements ISubject<E> {
        private List<IObserver<E>> observers = new ArrayList<>();


        @Override
        public boolean attach(IObserver<E> observer) {
            return !this.observers.contains(observer) && observers.add(observer);
        }

        @Override
        public boolean detach(IObserver<E> observer) {
            return observers.remove(observer);
        }

        @Override
        public void notify(E event) {
            for (IObserver<E> observer : observers) {
                observer.update(event);
            }

        }
    }


}
