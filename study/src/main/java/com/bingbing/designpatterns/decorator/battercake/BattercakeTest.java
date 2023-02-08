package com.bingbing.designpatterns.decorator.battercake;

/**
 * 客户端测试代码
 * @author : bingbing
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake=new BaseBattercake();

        battercake=new EggDecorator(battercake);

        battercake=new EggDecorator(battercake);

        battercake=new SausageDecorator(battercake);
        //与静态代理最大的区别就是职责不同，静态代理会做功能增强，同一个职责变的不一样，装饰器更多考虑的是扩展

        System.out.println(battercake.getMsg()+",总价"+battercake.getPrice());





    }


}
