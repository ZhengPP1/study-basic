package com.bingbing.designpatterns.bridge.general;

/**
 * 桥接模式
 * @author : bingbing
 */
public class Client {

    // 抽象
    static abstract class Abstraction{

        protected IImplementor iImplementor;

        public Abstraction(IImplementor iImplementor) {
            this.iImplementor = iImplementor;
        }

        public void operation(){
            this.iImplementor.operationImpl();

        }
    }

    // 修正抽象
    static class RefinedAbstraction extends Abstraction{

        public RefinedAbstraction(IImplementor iImplementor) {
            super(iImplementor);
        }

        @Override
        public void operation() {
            super.operation();
            System.out.println("refined operation");
        }
    }


    // 抽象实现
    interface IImplementor{
        void operationImpl();
    }

    static class ConcreteImplementorA implements IImplementor{

        @Override
        public void operationImpl() {
            System.out.println("具体实现A");
        }
    }

    static class ConcreteImplementorB implements IImplementor{

        @Override
        public void operationImpl() {
            System.out.println("具体实现B");
        }
    }
}
