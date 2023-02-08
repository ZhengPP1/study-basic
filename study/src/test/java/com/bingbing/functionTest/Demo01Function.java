package com.bingbing.functionTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author : bingbing
 * java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
 * 前者称为前置条件，后者称为后置条件。
 * Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
 * 使用的场景例如：将String类型转换为Integer类型。
 */
@Service
public class Demo01Function {
    public static void change(String s, Function<String,Integer> function){
        Integer apply = function.apply(s);
        System.out.println(apply);

    }

    public static void main(String[] args) {
        String s="www";
        change(s, Integer::parseInt);





        List<ABC> list=new ArrayList();
        LocalDateTime a=LocalDateTime.of(2022,9,19,18,18);
       // list.add(new ABC("涨乐活跃，有效户",true,true,false,a));//张乐活跃，有效户
        list.add(new ABC("涨乐活跃，有效户",true,true,false,a));//张乐活跃，有效户

       // list.add(new ABC("有效户",false,true,false,a));//有效户
       // list.add(new ABC("有效户",false,true,false,a)); //有效户
        list.add(new ABC("涨乐活跃",true,false,false,a)); //张乐活跃
        list.add(new ABC("一个月内服务",false,false,true,a)); //一个月内服务

        list.add(new ABC("涨乐活跃，有效户",true,true,false,a.minus(1,ChronoUnit.DAYS)));//张乐活跃，有效户
        list.add(new ABC("有效户",false,true,false,a.minus(1,ChronoUnit.DAYS))); //有效户
        list.add(new ABC("一个月内服务",false,false,true,a.minus(1,ChronoUnit.DAYS))); //一个月内服务
        list.add(new ABC("涨乐活跃",true,false,false,a.minus(1,ChronoUnit.DAYS))); //张乐活跃





        List<ABC> collect1 = list.stream().sorted(Comparator.comparing(ABC::getCreateTime)
                .thenComparing(e -> Optional.ofNullable(e.getIsValid()).orElse(Boolean.FALSE))
                .thenComparing(e -> Optional.ofNullable(e.getIsServiceInMonth()).orElse(Boolean.FALSE))
                .thenComparing(e -> Optional.ofNullable(e.getIsZlActivity()).orElse(Boolean.FALSE))

                .reversed()
        ).collect(Collectors.toList());

        Map<String, ABC> collect = list.stream().collect(Collectors.toMap(ABC::getName, Function.identity(), (oldVal, newVal) -> newVal));


      /*  System.out.println("=======================");
        for (ABC abc : collect1) {
            System.out.println(abc.getName());
        }*/

        System.out.println(LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalTime.MAX));

        System.out.println(LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalTime.MIN));


    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static class ABC{
        private String name;
        private Boolean isZlActivity;
        private Boolean isValid;
        private Boolean isServiceInMonth;
        private LocalDateTime createTime=LocalDateTime.now();
    }








}
