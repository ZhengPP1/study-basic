package com.bingbing.designpatterns.visitor.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bingbing
 */
public class BusinessReport {
    private List<Employee> list=new ArrayList<>();
    {
        list.add(new Enginner("tom"));

        list.add(new Enginner("jerry"));
        list.add(new Manager("tony"));
        list.add(new Manager("jack"));

    }

    public void showReport(IVisitor visitor){
        for (Employee employee : list) {
            employee.accept(visitor);
        }
    }


}
