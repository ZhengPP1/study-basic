package org.example;

import com.alibaba.fastjson.TypeReference;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author : bingbing
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        LocalDateTime localDate=LocalDateTime.now();
        People people=new People();



     /*   String str="0000012332223";
        System.out.println(Integer.parseInt(str));
*/


        List<String> list=null;
        Set<String> collect = list.stream().collect(Collectors.toSet());

    }

    @Data
    static class People{
        private LocalDate localDate;
    }
}