package com.bingbing.designpatterns.bridge.message;

/**
 * 实现消息发送的统一接口
 * @author : bingbing
 */
public interface IMessage {
    /**
     * 实现消息发送的统一接口
     * @param message 发送消息的内容
     * @param toUser 接收人
     */
    void send(String message,String toUser);
}
