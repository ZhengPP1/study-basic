package com.bingbing.designpatterns.visitor.kpi;

/**
 * @author bingbing
 */
public class CTOVisitor implements IVisitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("经理名称"+manager.getName()+"经理的产品数"+manager.getProductNum());

    }

    @Override
    public void visit(Enginner enginner) {
        System.out.println("工程师名称"+enginner.getName()+"工程师代码数量"+enginner.getCodeLines());

    }
}
