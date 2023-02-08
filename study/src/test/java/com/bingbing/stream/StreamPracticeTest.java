package com.bingbing.stream;

import com.bingbing.stream.entity.Person;
import org.junit.Test;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : bingbing
 */

public class StreamPracticeTest {
    @Test
    public void testFilter() {

        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
        //筛选员工中工资高于8000的人，并形成新的集合
        List<String> collect = personList.stream().filter(person -> person.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

    }

    @Test
    public void testAggregation() {
        //获取String集合中最长的元素。
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());
        //获取Integer集合中的最大值。
        List<Integer> list1 = Arrays.asList(7, 6, 9, 4, 11, 6);
        Optional<Integer> max1 = list1.stream().max(Integer::compareTo);
        System.out.println(max1.get());
        //获取员工工资最高的人。
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        Optional<String> max2 = personList.stream().max(Comparator.comparingInt(Person::getSalary)).map(Person::getName);
        System.out.println("获取员工工资最高的人" + max2.get());
        //计算Integer集合中大于6的元素的个数。
        List<Integer> list3 = Arrays.asList(7, 6, 4, 8, 2, 11, 9);
        long count = list3.stream().filter(x -> x > 6).count();
        System.out.println(count);

    }

    @Test
    public void testMap() {
        //英文字符串数组的元素全部改为大写
        String[] strArr = {"abcd", "bcdd", "defde", "fTr"};
        List<String> collect = Arrays.stream(strArr).map(x -> x.toUpperCase()).collect(Collectors.toList());
        List<String> collect1 = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
        collect.stream().forEach(System.out::print);
        //整数数组每个元素+3
        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> collect2 = intList.stream().map(x -> x + 3).collect(Collectors.toList());
        collect2.stream().forEach(System.out::print);
        //将员工的薪资全部增加1000。
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        List<Person> collect3 = personList.stream().map(person -> {
            person.setSalary(person.getSalary() + 10000);
            return person;
        }).collect(Collectors.toList());
        collect3.stream().forEach(x -> System.out.println(x.toString()));
        // 将两个字符数组合并成一个新的字符数组
        List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
        List<String> collect4 = list.stream().flatMap(s -> {
            String[] split = s.split(",");
            return Arrays.stream(split);
        }).collect(Collectors.toList());
        System.out.println(collect4);
    }


    @Test
    public void testReduce() {

        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        // 求和方式1
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());
        Optional<Integer> reduce1 = list.stream().reduce(Integer::sum);
        System.out.println(reduce1.get());
        Integer reduce2 = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce2);
        Optional<Integer> reduce3 = list.stream().reduce((x, y) -> x * y);
        System.out.println(reduce3.get());
        Optional<Integer> reduce4 = list.stream().reduce(Integer::max);
        System.out.println(reduce4.get());

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        Optional<Integer> reduce5 = personList.stream().map(person -> person.getSalary()).reduce((x, y) -> x > y ? x : y);
        System.out.println(reduce5.get());
        Optional<Integer> reduce6 = personList.stream().map(person -> person.getSalary()).reduce(Integer::max);
        System.out.println(reduce6.get());
        Optional<Integer> reduce7 = personList.stream().map(person -> person.getSalary()).reduce(Integer::sum);
        System.out.println(reduce7.get());

    }

    @Test
    public void testCollect() {
        List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        Set<Integer> collect1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(collect1);
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        Map<String, Object> collect2 = personList.stream().filter(p -> p.getSalary() > 8000).collect(Collectors.toMap(Person::getName, p -> p.getSalary()));
        System.out.println(collect2);

    }

    @Test
    public void testStatistics() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        Long collect = personList.stream().count();
        System.out.println(collect);
        Double collect1 = personList.stream().map(Person::getSalary).collect(Collectors.averagingDouble(x -> x));
        Double collect2 = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));

        System.out.println(collect1);
        System.out.println(collect2);
        Optional<Integer> collect3 = personList.stream().map(Person::getSalary).max(Integer::compare);
        personList.stream().map(Person::getSalary).collect(Collectors.maxBy(Integer::compare));
        System.out.println(collect3.get());
        Integer collect4 = personList.stream().mapToInt(Person::getSalary).sum();
        System.out.println(collect4);
        DoubleSummaryStatistics collect5 = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));
        System.out.println(collect5);

    }

    @Test
    public void testGroup(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));

        Map<Boolean, List<Person>> collect = personList.stream().collect(Collectors.partitioningBy(x -> x.getSalary() > 8000));
        System.out.println(collect);
        Map<String, List<Person>> collect1 = personList.stream().collect(Collectors.groupingBy(Person::getSex));

        System.out.println(collect1);
        Map<String, Map<String, List<Person>>> collect2 = personList.stream().collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
        System.out.println(collect2);
    }

    @Test
    public void testJoining(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        String collect = personList.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(collect);
        List<String> list = Arrays.asList("A", "B", "C");
        String collect1 = list.stream().collect(Collectors.joining("_"));
        System.out.println(collect1);
    }

    @Test
    public void testReducing(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        Integer reduce = personList.stream().map(Person::getSalary).reduce(0, (i, j) -> (i + j) - 5000);
        System.out.println(reduce);

    }

    @Test
    public void testSorted(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Owen", 8200, 25, "male", "New York"));
        personList.add(new Person("Anni", 8200, 26, "female", "New York"));
        List<String> collect = personList.stream().sorted(Comparator.comparing(Person::getSalary)).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect1);
        List<String> collect2 = personList.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect2);
    }



    @Test
    public void testContinue(){
        System.out.println(String.valueOf(Integer.parseInt(DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now()))));


    }

    public static boolean isEmpty(Object obj) {
        // FIRST CHECK
        if (null == obj) {
            return true;
        }
        // OTHER CHECK
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        } else if (obj instanceof Map) {
            return ((Map<?, ?>) obj).isEmpty();
        } else if (obj instanceof Iterable) {
            return !((Iterable<?>) obj).iterator().hasNext();
        } else if (obj instanceof Iterator) {
            return !((Iterator<?>) obj).hasNext();
        }
        // OTHER TYPE NOT NULL
        return false;
    }


    @Test
    public void testArray(){

        String join = String.join(",", Collections.emptyList());
        System.out.println(join);
    }


}
