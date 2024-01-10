package com.bingbing.designpatterns.visitor.kpi;

/**
 * @author bingbing
 */
public interface IVisitor {
    void visit(Manager manager);

    void visit(Enginner enginner);

}
