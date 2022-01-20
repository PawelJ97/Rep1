package com.company;

public class Human extends Animal {

    String firstName;
    String lastName;
    private Double salary;

    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
            this.salary = salary;
        }

    }



