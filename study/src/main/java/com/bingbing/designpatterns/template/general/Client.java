package com.bingbing.designpatterns.template.general;

/**
 * 模版方法模式的通用写法
 * @author : bingbing
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();

        concreteClassA=new ConcreteClassB();
        concreteClassA.templateMethod();
    }
    /**
     * 抽象模版类
     */
    static abstract class AbstractClass {

        protected void step1() {
            System.out.println("AbstractClass:step1");
        }

        protected void step2() {
            System.out.println("AbstractClass:step2");
        }

        protected void step3() {
            System.out.println("AbstractClass:step3");
        }

        /**
         * 声明为final类型的方法，避免子类对其覆盖
         */
        public final void templateMethod() {
            this.step1();
            this.step2();
            this.step3();
        }

    }

    /**
     * 具体实现类A
     */
    static class ConcreteClassA extends AbstractClass {
        @Override
        protected void step1() {
            System.out.println("concreteClassA:step1");

        }

    }

    /**
     * 具体实现类B
     */
    static class ConcreteClassB extends AbstractClass {
        @Override
        protected void step2() {
            System.out.println("concreteClassB:step2");

        }

    }
}
