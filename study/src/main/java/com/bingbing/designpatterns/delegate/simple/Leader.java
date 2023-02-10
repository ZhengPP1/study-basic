package com.bingbing.designpatterns.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : bingbing
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> employeeMap=new HashMap<>();

    public Leader() {
        employeeMap.put("python",new EmployeeA());
        employeeMap.put("poster",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if (!employeeMap.containsKey(task)){
            System.out.println("这个任务超出我的能力范围"+task);
            return;
        }

        employeeMap.get(task).doing(task);
    }
}
