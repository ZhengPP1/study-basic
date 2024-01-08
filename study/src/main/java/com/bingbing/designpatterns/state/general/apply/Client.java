package com.bingbing.designpatterns.state.general.apply;

/**
 * @author bingbing
 */
public class Client {

    /**
     * 抽象状态
     */
    interface IState {
        void handle();
    }

    /**
     * 具体状态
     */
    static class ConcreteStateA implements IState {
        @Override
        public void handle() {
            // 必要时进行状态切换
            System.out.println("StateA do action");
        }
    }

    /**
     * 具体状态
     */
    static class ConcreteStateB implements IState {
        @Override
        public void handle() {
            // 必要时进行状态切换
            System.out.println("StateB do action");
        }
    }

    /**
     * 环境类
     */
    static class Context {
        public static final IState STATE_A = new ConcreteStateA();
        public static final IState STATE_B = new ConcreteStateB();
        /**
         * 默认状态A
         */
        private IState currentState = STATE_A;

        public void setState(IState state) {
            this.currentState = state;
        }

        public void handle() {
            this.currentState.handle();
        }
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
