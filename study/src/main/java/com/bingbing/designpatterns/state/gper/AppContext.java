package com.bingbing.designpatterns.state.gper;

/**
 * @author bingbing
 */
public class AppContext {
    public static final UserState LOGIN_STATE = new LoginState();

    public static final UserState UN_LOGIN_STATE = new UnLoginState();

    private UserState currentState = UN_LOGIN_STATE;

    {
        LOGIN_STATE.setAppContext(this);
        UN_LOGIN_STATE.setAppContext(this);
    }

    public void setState(UserState currentState) {
        this.currentState = currentState;
        this.currentState.setAppContext(this);
    }

    public UserState getState() {
        return currentState;
    }

    public void favorite(){
        this.currentState.favorite();
    }

    public void comment(String comment){
        this.currentState.comment(comment);
    }

    public static void main(String[] args) {
        AppContext context=new AppContext();
        context.favorite();
        context.comment("评论一下啊");
    }

}
