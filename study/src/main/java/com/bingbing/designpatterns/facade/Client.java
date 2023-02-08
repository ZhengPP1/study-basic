package com.bingbing.designpatterns.facade;

/**
 * 装饰器模式通用写法
 *
 * @author : bingbing
 */
public class Client {


    /**
     * 抽象组件
     */
    static abstract class Component {
        /**
         *
         */
        public abstract void operation();

    }

    /**
     * 具体组件
     */
    static class ConcreteComponent extends Component{

        @Override
        public void operation() {
            //相应的功能处理
            System.out.println("处理业务逻辑");

        }
    }

    /**
     *
     */
    static abstract class Decorator extends Component {
        /**
         * 抽象组件对象
         */
        protected Component component;

        /**
         * 构造方法，传入组件对象
         * @param component 组件对象
         */
        public Decorator(Component component) {
            this.component = component;
        }

        public void operation(){
            //转发请求给组件对象，可以在转发前后执行一些附加动作
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
         * @param component 组件对象
         */
        public ConcreteDecoratorA(Component component) {
            super(component);
        }

        /**
         * 调用父类的operation方法之前需要执行的操作
         */
        private void operationFirst(){}
        /**
         * 调用父类的operation方法之后需要执行的操作
         */
        private void operationLast(){}

        public void operation(){
            //调用父类的方法，可以在调用前后执行一些附加动作
            operationFirst(); //添加的功能
            super.operation();  //这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法，实现了新的功能
            operationLast(); //添加的功能

        }

    }
    /**
     * 具体装饰器B
     */
    static class ConcreteDecoratorB extends Decorator{
        /**
         * 构造方法，传入组件对象
         *
         * @param component 组件对象
         */
        public ConcreteDecoratorB(Component component) {
            super(component);
        }

        /**
         * 调用父类的operation方法之前需要执行的操作
         */
        private void operationFirst(){}
        /**
         * 调用父类的operation方法之后需要执行的操作
         */
        private void operationLast(){}

        public void operation(){
            //调用父类的方法，可以在调用前后执行一些附加动作
            operationFirst(); //添加的功能
            super.operation();  //这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法，实现了新的功能
            operationLast(); //添加的功能

        }

    }

















}
