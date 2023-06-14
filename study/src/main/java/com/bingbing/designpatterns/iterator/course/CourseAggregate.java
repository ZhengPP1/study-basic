package com.bingbing.designpatterns.iterator.course;

/**
 * @author : bingbing
 */
public interface CourseAggregate {
    void add(Course course);
    void remove(Course course);
    Iterator<Course> iterator();
}
