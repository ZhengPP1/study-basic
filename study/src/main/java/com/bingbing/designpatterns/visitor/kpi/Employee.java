package com.bingbing.designpatterns.visitor.kpi;

import java.util.Random;

/**
 * @author bingbing
 */
public abstract class Employee {
    private String name;

    private int kpi;

    public Employee(String name) {
        this.name = name;
        this.kpi=new Random().nextInt();
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    public abstract void accept(IVisitor visitor);
}
