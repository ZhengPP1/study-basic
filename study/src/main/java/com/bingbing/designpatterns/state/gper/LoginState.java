package com.bingbing.designpatterns.state.gper;

/**
 * 登录状态
 * @author bingbing
 */
public class LoginState extends UserState{
    @Override
    public void favorite() {
        System.out.println("favorite success!");

    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
