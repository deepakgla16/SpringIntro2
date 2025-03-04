package com.example.HelloWorld;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName = "IT";

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department: " + deptName;
    }
}
