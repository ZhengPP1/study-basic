package com.bingbing.designpatterns.chain.general;

/**
 * @author : bingbing
 */
public class Client {

    /**
     * 抽象处理者
     */
    static abstract class Handler{

        protected Handler nextHandler;

        public void setNextHandler(Handler nextHandler) {
            this.nextHandler = nextHandler;
        }

        public abstract void handlerRequest(String request);
    }

    /**
     * 具体处理者A
     */
    static class ConcreteHandlerA extends Handler{
        @Override
        public void handlerRequest(String request) {
            if ("requestA".equals(request)){
                System.out.println(this.getClass().getSimpleName()+"deal with request:"+request);
                return;
            }
            if (this.nextHandler!=null){
                this.nextHandler.handlerRequest(request);
            }
        }
    }


    /**
     * 具体处理者B
     */
    static class ConcreteHandlerB extends Handler{
        @Override
        public void handlerRequest(String request) {
            if ("requestB".equals(request)){
                System.out.println(this.getClass().getSimpleName()+"deal with request:"+request);
                return;
            }
            if (this.nextHandler!=null){
                this.nextHandler.handlerRequest(request);
            }
        }
    }



}
