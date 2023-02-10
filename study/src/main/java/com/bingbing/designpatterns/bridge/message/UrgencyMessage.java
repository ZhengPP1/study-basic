package com.bingbing.designpatterns.bridge.message;

/**
 * 加急消息类
 * @author : bingbing
 */
public class UrgencyMessage extends AbstractMessage{

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message="加急："+message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展他的功能，监控某个消息的处理状态，根据给出的messageId查询消息的处理状态
     * @param messageId 消息ID
     * @return 监控的处理状态
     */
    public Object watch(String messageId){
        return null;
    }

}
