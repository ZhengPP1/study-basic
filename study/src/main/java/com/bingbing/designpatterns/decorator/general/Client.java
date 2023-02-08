package com.bingbing.designpatterns.decorator.general;

/**
 * 装饰器模式的通用写法
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        //创建需要被装饰的原始对象（即要被装饰的对象）
        Component c1=new concreteComponent();
        //给对象透明的增加功能A并调用
        Decorator decoratorA=new ConcreteDecoratorA(c1);
        decoratorA.operation();

        Decorator decoratorB=new ConcreteDecoratorB(c1);
        decoratorB.operation();
        //装饰器也可以装饰具体的装饰对象，此时相当于在给对象在增加功能A的基础上再增加功能B
        Decorator decoratorBandA=new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();

    }


    static abstract class Component{

        public abstract void operation();
    }

    /**
     * 相应的功能处理
     */
    static class concreteComponent extends Component{
        @Override
        public void operation() {
            //相应的功能处理
            System.out.println("处理业务逻辑");
        }
    }


    static abstract class Decorator extends Component{

        /**
         * 持有组件对象
         */
        protected Component component;

        /**
         * 构造方法，传入组件对象
         * @param component
         */
        public Decorator(Component component) {
            this.component = component;
        }

        public void operation(){
            /**
             * 转发请求给组件对象，可以在转发前后执行一些附加动作
             */
            component.operation();
        }
    }
    /**
     * 具体装饰器A
     */
    static class ConcreteDecoratorA extends Decorator{


        /**
         * 构造方法，传入组件对象
         *
         * @param component
         */
        public ConcreteDecoratorA(Component component) {
            super(component);
        }
        /**
         * 在调用父类的operation方法之前需要执行的操作
         * */
        private void operationFirst(){}

        /**
         * 在调用父类的operation方法之后需要执行的操作
         * */
        private void operationLast(){}

        public void operation(){
            operationFirst();
            //这里可以选择性的调用父类的方法，如果不调用，则相当于完全改写了方法，实现了新的功能
            super.operation();
            operationLast();
        }
    }

    /**
     * 具体装饰器A
     */
    static class ConcreteDecoratorB extends Decorator{


        /**
         * 构造方法，传入组件对象
         *
         * @param component
         */
        public ConcreteDecoratorB(Component component) {
            super(component);
        }
        /**
         * 在调用父类的operation方法之前需要执行的操作
         * */
        private void operationFirst(){}

        /**
         * 在调用父类的operation方法之后需要执行的操作
         * */
        private void operationLast(){}

        public void operation(){
            operationFirst();
            //这里可以选择性的调用父类的方法，如果不调用，则相当于完全改写了方法，实现了新的功能
            super.operation();
            operationLast();
        }
    }



}
