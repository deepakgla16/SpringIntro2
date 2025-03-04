package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name = "Bhupesh";
    private int id = 432;

    private final Department department;

    @Autowired
    public Employee(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDepartmentName() {
        return department.getDeptName();
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", " + department;
    }
}
