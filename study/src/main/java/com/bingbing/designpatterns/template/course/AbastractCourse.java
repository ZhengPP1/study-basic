package com.bingbing.designpatterns.template.course;

/**
 * @author : bingbing
 */
public abstract class AbastractCourse {
    public final void createCourse() {

        postPreResoucse();

        createPPT();

        liveVideo();

        postHomework();

        if (needCheckHomework()){
            checkHomework();
        }


    }

    protected abstract void checkHomework();

    /**
     * 钩子方法
     * 设计钩子方法的主要目的是干预执行流程，使得控制行为流程更加灵活，更符合实际业务的需求。
     * 钩子方法的返回值一般为适合条件分支语句的返回值（如boolean、int等
     */
    protected boolean needCheckHomework() {
        return false;
    }

    protected void postHomework() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("直播授课");
    }

    protected void createPPT() {
        System.out.println("制作课件");
    }

    protected void postPreResoucse() {
        System.out.println("发布预习资料");
    }
}
