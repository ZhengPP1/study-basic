package com.bingbing.designpatterns.iterator.general;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式的通用写法
 * @author : bingbing
 */
public class Client {

    /**
     * 抽象迭代器
     * @param <E>
     */
    interface Iterator<E> {
        E next();
        boolean hasNext();
    }

    /**
     * 抽象容器
     * @param <E>
     */
    interface IAggregate<E> {
        boolean add(E element);
        boolean remove(E element);
        Iterator<E> iterator();
    }

    /**
     * 具体迭代器
     * @param <E>
     */
    static class ConcreteIterator<E> implements Iterator<E> {
        private List<E> list;

        private int cursor = 0;

        public ConcreteIterator(List<E> list) {
            this.list = list;
        }

        @Override
        public E next() {
            return this.list.get(this.cursor++);
        }

        @Override
        public boolean hasNext() {
            return this.cursor< this.list.size();
        }
    }

    /**
     * 具体容器
     * @param <E>
     */
    static class ConcreteAggregate<E> implements IAggregate<E> {
        private List<E> list = new ArrayList<E>();

        @Override
        public boolean add(E element) {
            return this.list.add(element);
        }

        @Override
        public boolean remove(E element) {
            return this.list.remove(element);
        }

        @Override
        public Iterator<E> iterator() {
            return new ConcreteIterator<E>(this.list);
        }
    }

}
