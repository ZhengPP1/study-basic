package com.bingbing.designpatterns.chain.auth.optimize;

import com.bingbing.designpatterns.chain.auth.Member;

/**
 * 登录校验LoginHandler类
 * @author : bingbing
 */
public class LoginHandle extends Handler{
    @Override
    public void doHandle(Member member) {
        System.out.println("登录成功");
        member.setRoleName("管理员");

        chain.doHandle(member);
    }
}
