package com.bingbing.designpatterns.strategy.general;

/**
 * 策略模式的通用写法
 * @author : bingbing
 */
public class Client {


    public static void main(String[] args) {
        IStrategy concretStraregyA = new ConcretStraregyA();
        Context context=new Context(concretStraregyA);
        context.algorithm();
    }


    // 抽象策略类IStrategy
    interface IStrategy{

        void algorithm();
    }

    /**
     * 上下文环境
     */
    static class Context{
        private IStrategy strategy;

        public Context(IStrategy strategy) {
            this.strategy = strategy;
        }
        public void algorithm(){
            this.strategy.algorithm();
        }
    }

    /**
     * 具体策略类
     */
    static class ConcretStraregyA implements IStrategy{

        @Override
        public void algorithm() {
            System.out.println("strategy A");
        }
    }
    /**
     * 具体策略类
     */
    static class ConcretStraregyB implements IStrategy{

        @Override
        public void algorithm() {
            System.out.println("strategy B");
        }
    }
}
