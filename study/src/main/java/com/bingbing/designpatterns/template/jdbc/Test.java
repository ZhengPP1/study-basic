package com.bingbing.designpatterns.template.jdbc;

import com.bingbing.designpatterns.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * 测试类
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> objects = memberDao.selectAll();
        System.out.println(objects);
    }
}
