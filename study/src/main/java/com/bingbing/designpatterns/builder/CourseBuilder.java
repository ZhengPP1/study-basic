package com.bingbing.designpatterns.builder;

/**
 * 建造者类
 *
 * @author : bingbing
 */
public class CourseBuilder {
    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }


    public CourseBuilder addPpt(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }


    public CourseBuilder addHomework(String homework){
        course.setHomework(homework);
        return this;
    }


    public Course build(){

        return course;
    }


}
