package com.bingbing.designpatterns.chain.auth.builderchain;

import com.bingbing.designpatterns.chain.auth.Member;
import com.bingbing.designpatterns.chain.auth.optimize.AuthHandler;
import com.bingbing.designpatterns.chain.auth.optimize.LoginHandle;
import com.bingbing.designpatterns.chain.auth.optimize.ValidateHandler;

/**
 * @author : bingbing
 */
public class MemberService {

//    public void login(String loginName, String loginPass) {
//        Handler.Builder builder = new Handler.Builder();
//        builder.addHandler(new ValidateHandler())
//                .addHandler(new LoginHandle())
//                .addHandler(new AuthHandler());
//        builder.build().doHandler(new Member(loginName, loginPass));
//    }
}
