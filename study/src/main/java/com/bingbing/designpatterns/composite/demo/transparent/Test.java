package com.bingbing.designpatterns.composite.demo.transparent;

/**
 * 测试类
 * @author : bingbing
 */
public class Test {
    public static void main(String[] args) {
        CourseComponent javaBase = new Course("Java", 8280);
        CourseComponent ai = new Course("ai", 5000);


        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent design = new Course("Java设计模式", 1500);
        CourseComponent source = new Course("源码分析", 2000);
        CourseComponent softSkill = new Course("软技能", 3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        CourseComponent catalog = new CoursePackage("咕泡课程目录", 1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();

    }
}
