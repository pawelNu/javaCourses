package com.pawelnu.intermediate.e2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee (1,"Myra","Tregear",3515, "MID"));
        employeeList.add(new Employee (2,"Desmond","Excell",4900, "MID"));
        employeeList.add(new Employee (3,"Albrecht","Desouza",5855, "MID"));
        employeeList.add(new Employee (4,"Jamima","Pavlenko",5253, "LOW"));
        employeeList.add(new Employee (5,"Sophia","Hubbucks",5994, "MID"));
        employeeList.add(new Employee (6,"Cindelyn","Branch",4105, "MID"));
        employeeList.add(new Employee (7,"Viviene","Sokale",4596, "LOW"));
        employeeList.add(new Employee (8,"Beau","Lackemann",3577, "LOW"));
        employeeList.add(new Employee (9,"Dotty","Richichi",5193, "HIGH"));
        employeeList.add(new Employee (10,"Silvan","Paton",4195, "LOW"));

        return employeeList;
    }
}
