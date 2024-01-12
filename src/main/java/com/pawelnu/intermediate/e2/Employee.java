package com.pawelnu.intermediate.e2;

public class Employee {
    private final Integer id;
    private String name;
    private String lastName;
    private Integer salary;
    private String position;

    public Employee(Integer id, String name, String lastName, Integer salary, String position) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Integer='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
