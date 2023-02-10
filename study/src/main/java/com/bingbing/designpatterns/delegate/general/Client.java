package com.bingbing.designpatterns.delegate.general;

import java.util.Random;

/**
 * 委派模式的通用写法
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        new Delegate().doTask();
    }
    /**
     * 抽象任务角色
     */
    interface Task{
        void doTask();
    }

    /**
     * 具体任务角色A
     */
    static class ConcreteA implements Task{
        @Override
        public void doTask() {
            System.out.println("执行A");
        }
    }

    /**
     * 具体任务角色B
     */
    static class ConcreteB implements Task{
        @Override
        public void doTask() {
            System.out.println("执行B");
        }
    }

    static class Delegate implements Task{

        @Override
        public void doTask() {
            System.out.println("代理执行开始");
            Task task=null;
            if (new Random().nextBoolean()){
                task=new ConcreteA();
                task.doTask();
            }else {
                task=new ConcreteB();
                task.doTask();
            }
            System.out.println("代理执行完毕");
        }
    }


}
