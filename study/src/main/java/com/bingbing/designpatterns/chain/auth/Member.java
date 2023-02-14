package com.bingbing.designpatterns.chain.auth;

/**
 * @author : bingbing
 */
public class Member {

    private String loginName;


    private String loginPass;

    private String roleName;

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }


    public String getLoginName() {
        return loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "loginName='" + loginName + '\'' +
                ", loginPass='" + loginPass + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
