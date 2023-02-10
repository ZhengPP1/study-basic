package com.bingbing.designpatterns.bridge.message;

/**
 * 桥接抽象角色 抽象消息类
 * @author : bingbing
 */
public abstract class AbstractMessage {
    // 持有一个实现部分的对象
    IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }
    // 发送消息，委派给实现部分的方法
    public void sendMessage(String message,String toUser){

        this.message.send(message,toUser);
    }
}
