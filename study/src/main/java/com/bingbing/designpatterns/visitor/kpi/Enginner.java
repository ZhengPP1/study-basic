package com.bingbing.designpatterns.visitor.kpi;

import java.util.Random;

/**
 * @author bingbing
 */
public class Enginner extends Employee{
    public Enginner(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt();
    }
}
