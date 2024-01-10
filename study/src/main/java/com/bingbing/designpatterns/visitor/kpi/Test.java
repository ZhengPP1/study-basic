package com.bingbing.designpatterns.visitor.kpi;

/**
 * @author bingbing
 */
public class Test {
    public static void main(String[] args) {
        BusinessReport businessReport=new BusinessReport();
        businessReport.showReport(new CEOVisitor());
        businessReport.showReport(new CTOVisitor());

    }
}
