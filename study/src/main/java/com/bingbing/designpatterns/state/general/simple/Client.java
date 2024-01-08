package com.bingbing.designpatterns.state.general.simple;

/**
 * @author bingbing
 */
public class Client {

    /**
     * 抽象状态state
     */
    static abstract class State{
        protected Context context;

        public void setContext(Context context) {
            this.context = context;
        }

        public abstract void handle();
    }

    /**
     * 具体状态A
     */
    static class ConcreteStateA extends State{

        @Override
        public void handle() {
            System.out.println("StateA do handle");
            context.setState(Context.STATE_B);
            context.getState().handle();
        }
    }
    /**
     * 具体状态B
     */
    static class ConcreteStateB extends State{
        @Override
        public void handle() {
            System.out.println("StateB do handle");

        }
    }

    /**
     * 环境类
     */
    static class Context{
        public static final State STATE_A=new ConcreteStateA();
        public static final State STATE_B= new ConcreteStateB();

        private State currentState=STATE_A;

        {
            STATE_A.setContext(this);
            STATE_B.setContext(this);
        }

        public void setState(State state) {
            this.currentState = state;
            currentState.setContext(this);
        }

        public State getState(){
            return currentState;
        }

        public void handle(){
            this.currentState.handle();
        }


    }


}
