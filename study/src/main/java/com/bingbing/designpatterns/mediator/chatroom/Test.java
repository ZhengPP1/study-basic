package com.bingbing.designpatterns.mediator.chatroom;

/**
 * @author bingbing
 */
public class Test {
    public static void main(String[] args) {
        ChatRoom room=new ChatRoom();
        User tom=new User("Tom",room);

        User Zpp=new User("Zpp",room);
        tom.sendMessage("lalalala");

        Zpp.sendMessage("diejdfikdlf");

    }
}
