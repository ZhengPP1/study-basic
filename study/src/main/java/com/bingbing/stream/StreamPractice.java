package com.bingbing.stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author : bingbing
 */

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(7,6,9,3,8,2,1);
        List<Integer> collect = list.stream().filter(x -> x > 6).collect(Collectors.toList());
        collect.forEach(System.out::println);
        list.stream().filter(x->x>6).forEach(System.out::println);
        Optional<Integer> first = list.stream().filter(x -> x > 6).findFirst();
        Optional<Integer> any = list.parallelStream().filter(x -> x > 6).findAny();
        boolean b = list.stream().anyMatch(x -> x > 6);
        System.out.println("匹配第一个值：" + first.get());
        System.out.println("匹配任意一个值：" + any.get());
        System.out.println("是否存在大于6的值：" + b);

    }
}
