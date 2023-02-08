package com.bingbing.designpatterns.composite.demo.transparent;

/**
 * 顶层的抽象组件CourseComponent类
 * 把所有可能用到的方法都定义到这个顶层的抽象组件中，但是不写任何逻辑处理的代码，而是直接抛异常。
 * 这里，为什么不用抽象方法？因为用了抽象方法，其子类就必须实现，这样便体现不出各子类的细微差异所以子类继承此抽象类后，只需要重写有差异的方法覆盖父类的方法即可。
 * @author bingbing
 */
public abstract class CourseComponent {

    public void addChild(CourseComponent component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponent component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CourseComponent component) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponent component) {
        throw new UnsupportedOperationException("不支持获得价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
