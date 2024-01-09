package com.bingbing.designpatterns.state.gper;

/**
 * 抽象状态角色
 * @author bingbing
 */
public abstract class UserState {
    protected AppContext appContext;

    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void favorite();

    public abstract void comment(String comment);

}

