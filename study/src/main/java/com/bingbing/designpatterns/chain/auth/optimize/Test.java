package com.bingbing.designpatterns.chain.auth.optimize;

/**
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("bin","qwe");
    }
}
