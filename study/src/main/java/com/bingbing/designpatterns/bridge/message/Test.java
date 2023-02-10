package com.bingbing.designpatterns.bridge.message;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        IMessage message=new SmsMessage();

        AbstractMessage nomalMessage = new NomalMessage(message);
        nomalMessage.sendMessage("啦啦啦","bingbing");
        IMessage emailMessage=new EmailMessage();

        UrgencyMessage urgencyMessage = new UrgencyMessage(emailMessage);
        urgencyMessage.sendMessage("zezzzz","lll");
    }
}
