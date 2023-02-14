package com.bingbing.designpatterns.chain.auth.optimize;

import com.bingbing.designpatterns.chain.auth.Member;

/**
 * @author : bingbing
 */
public class MemberService {
    public void login(String loginName,String loginPass){

        Handler validateHandler = new ValidateHandler();
        Handler loginHandle = new LoginHandle();
        Handler authHandler = new AuthHandler();

        validateHandler.next(loginHandle);
        loginHandle.next(authHandler);
        validateHandler.doHandle(new Member(loginName,loginPass));


    }
}
