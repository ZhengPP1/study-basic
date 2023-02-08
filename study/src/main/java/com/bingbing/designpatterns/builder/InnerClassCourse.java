package com.bingbing.designpatterns.builder;

import lombok.Data;

/**
 * 静态内部类实现建造者模式
 * @author : bingbing
 */
@Data
public class InnerClassCourse {

    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }


    public static class Builder{
        private InnerClassCourse course=new InnerClassCourse();

        public Builder addName(String name) {
            course.setName(name);
            return this;
        }


        public Builder addPpt(String ppt) {
            course.setPpt(ppt);
            return this;
        }

        public Builder addVideo(String video) {
            course.setVideo(video);
            return this;
        }

        public Builder addNote(String note) {
            course.setNote(note);
            return this;
        }


        public Builder addHomework(String homework){
            course.setHomework(homework);
            return this;
        }

        public InnerClassCourse builder(){

            return course;
        }

    }



}
