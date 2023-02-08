package com.bingbing.designpatterns.composite.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : bingbing
 */
public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<>();
    private String name;

    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }


    @Override
    public void addChild(CourseComponent component) {
        items.add(component);
    }

    @Override
    public void removeChild(CourseComponent component) {
        items.remove(component);
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CourseComponent item : items) {
            //控制显示格式
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
                for (Integer i = 0; i < this.level; i++) {

                    //每一行开始打印一个+号
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }

            }
            item.print();
        }


    }
}
