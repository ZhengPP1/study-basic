package com.bingbing.stream.entity;

import lombok.*;

/**
 * @author : bingbing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String name;
    private int salary;
    private int age;
    private String sex;
    private String area;
}
