package com.bingbing.designpatterns.mediator.chatroom;

/**
 * @author bingbing
 */
public class ChatRoom {
    public void showMsg(User user,String msg){
        System.out.println("{"+user.getName()+"}:"+msg);
    }

}
