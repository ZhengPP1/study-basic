package com.bingbing.designpatterns.bridge.message;

/**
 * 普通消息类
 * @author : bingbing
 */
public class NomalMessage extends AbstractMessage{
    public NomalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 对于普通消息 直接调用父类方法发送消息
        super.sendMessage(message, toUser);
    }
}
