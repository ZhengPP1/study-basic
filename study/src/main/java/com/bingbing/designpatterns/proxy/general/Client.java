package com.bingbing.designpatterns.proxy.general;

/**
 * 代理模式
 * @author : bingbing
 */
public class Client {


    public static void main(String[] args) {
        Proxy proxy=new Proxy(new RealSubject());
        proxy.request();
    }
    /**
     * 抽象主题角色
     */
    interface ISubject{
        /**
         * 公共方法
         */
        void request();

    }

    static class Proxy implements ISubject{

        private ISubject subject;

        public Proxy(ISubject subject) {
            this.subject = subject;
        }

        @Override
        public void request() {
            before();
            subject.request();
            after();
        }
        public void before(){
            System.out.println("called before request().");
        }

        public void after(){
            System.out.println("called after request().");
        }
    }


    static class RealSubject implements ISubject{
        @Override
        public void request() {
            System.out.println("real service is called");
        }
    }

}
