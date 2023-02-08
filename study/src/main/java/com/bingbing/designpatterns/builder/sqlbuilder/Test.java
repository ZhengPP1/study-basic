package com.bingbing.designpatterns.builder.sqlbuilder;

import javax.management.Query;
import java.util.Arrays;

/**
 * Created by bingbing.
 */
public class Test {
    public static void main(String[] args) {

        QueryRule queryRule = QueryRule.getInstance();
        queryRule.addAscOrder("age")
                .andEqual("addr","Changsha")
                .andLike("name","Tom")
                .andGreaterEqual("age",18);

        QueryRuleSqlBuilder builder = new QueryRuleSqlBuilder(queryRule);

        System.out.println(builder.builder("t_member"));

        System.out.println("Params: " + Arrays.toString(builder.getValues()));

    }
}
