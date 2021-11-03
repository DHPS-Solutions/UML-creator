package com.test;

public class Employer {

    private String name;
    private int age;
    private Employee employee;

    public Employer(String name, int age, Employee employee) {
       this.name = name;
       this.age = age;
       this.employee = employee;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }
}
