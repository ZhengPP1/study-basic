package com.bingbing.designpatterns.chain.auth.old;

import com.bingbing.designpatterns.chain.auth.Member;
import org.springframework.util.StringUtils;

/**
 * 验证登录前的数据验证的普通写法
 * @author : bingbing
 */
public class MemberService {

    public void login(String loginName,String loginPass){
        if(StringUtils.isEmpty(loginName) ||
                StringUtils.isEmpty(loginPass)){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");

        Member member = checkExists(loginName,loginPass);
        if(null == member){
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");

        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");

    }

    private Member checkExists(String loginName,String loginPass){
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }

    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.login("tom","666");
    }

}