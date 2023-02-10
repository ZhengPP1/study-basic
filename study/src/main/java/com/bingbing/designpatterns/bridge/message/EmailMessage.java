package com.bingbing.designpatterns.bridge.message;

/**
 * @author : bingbing
 */
public class EmailMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送" + message + "给" + toUser);
    }
}
