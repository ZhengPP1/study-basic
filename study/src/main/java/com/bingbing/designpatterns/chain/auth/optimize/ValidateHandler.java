package com.bingbing.designpatterns.chain.auth.optimize;

import com.bingbing.designpatterns.chain.auth.Member;
import org.springframework.util.StringUtils;

/**
 * 非空校验ValidateHandler类
 * @author : bingbing
 */
public class ValidateHandler extends Handler {
    @Override
    public void doHandle(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) ||
                StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        chain.doHandle(member);
    }


}
