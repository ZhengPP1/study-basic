package com.bingbing.designpatterns.chain.auth.optimize;

import com.bingbing.designpatterns.chain.auth.Member;

/**
 * 权限校验AuthHandler类
 *
 * @author : bingbing
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandle(Member member) {
        if (!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");
    }
}
