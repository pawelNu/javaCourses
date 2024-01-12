package com.pawelnu.intermediate.e2;

import java.util.List;

public class E2 {
    /*
    Create an Employee class.
     Each employee must have:
     ID, name, lastname, salary and position (LOW, MID, HIGH).
     Create a list of 10 employees.
     Write a stream that prints the ID of each mid-level employee,
     earning between PLN 4,000 and PLN 5,000,
     changing his salary to PLN 4,800.
     At the end, the program is to iterate through the loop through all users
     and write them out on the screen.
    */
    public static void filterEmployees(List<Employee> list) {
        list.stream()
                .filter(e -> e.getPosition().equalsIgnoreCase("mid"))
                .filter(e -> e.getSalary() >= 4000)
                .filter(e -> e.getSalary() <= 5000)
                .peek(e -> e.setSalary(4800))
                .map(Employee::getId)
                .forEach(System.out::println);

        list.forEach(System.out::println);
    }
}
