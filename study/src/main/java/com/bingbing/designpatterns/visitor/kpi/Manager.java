package com.bingbing.designpatterns.visitor.kpi;

import java.util.Random;

/**
 * @author bingbing
 */
public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProductNum(){
        return new Random().nextInt();
    }
}
