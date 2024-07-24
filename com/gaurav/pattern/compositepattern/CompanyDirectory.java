package com.gaurav.pattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployee() {
        for (Employee e  : employeeList)
            e.showEmployee();
    }

    public void addEmployee(Employee e){
        employeeList.add(e);
    }

    public void removeEmployee (Employee e){
       if( !employeeList.isEmpty()){
           employeeList.remove(e);
       }
    }
}
