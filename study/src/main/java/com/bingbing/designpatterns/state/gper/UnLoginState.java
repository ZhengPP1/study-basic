package com.bingbing.designpatterns.state.gper;

/**
 * @author bingbing
 */
public  class UnLoginState extends UserState{


    @Override
    public void favorite() {
        switchToLogin();
        this.appContext.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        switchToLogin();
        this.appContext.getState().comment(comment);
    }

    public void switchToLogin(){
        System.out.println("跳转到登录界面");
       this.appContext.setState(AppContext.LOGIN_STATE);
    }
}

