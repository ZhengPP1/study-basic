package com.bingbing.designpatterns.command.general;

/**
 * @author bingbing
 */
public class Client {
    /**
     * 接受者
     */
    static class Receiver{
        public void action(){
            System.out.println("执行具体的操作");
        }
    }

    /**
     * 抽象命令接口
     */
    interface ICommand{
        void execute();

    }
    // 具体的命令
    static class ConcreteCommand implements ICommand{
        /**
         * 直接创建接受者，不暴露给客户端
         */
        private Receiver receiver=new Receiver();
        @Override
        public void execute() {
            this.receiver.action();
        }
    }

    // 请求者
    static class Invoker{
        private ICommand command;

        public Invoker(ICommand command) {
            this.command = command;
        }

        public void action(){
            this.command.execute();
        }
    }


}
