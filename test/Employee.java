package com.test;

public class Employee {
    private String name;
    private int age;
    private int yearsEmployed;

    public Employee(String name, int age, int yearsEmployed) {
        this.name = name;
        this.age = age;
        this.yearsEmployed = yearsEmployed;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private int calculateYearHired() {
        return 2021 - yearsEmployed;
    }

    public int getYearHired() {
        return calculateYearHired();
    }
}
