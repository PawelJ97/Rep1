package com.company;

import com.company.Devices.Car;
import com.company.Devices.Phone;
import creature.Animal;

public class Human extends Animal {

    String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    public Car car;
    public Phone mobile;
    public Animal pet;
    public Human human1;

    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 0.0;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
            this.salary = salary;
        }

    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Handel ludźmi jest niedozwolony");
        } else if (seller.human1 != this){
            System.out.println("Handel ludźmi jest niedozwolony");
        } else {
            System.out.println("Handel ludźmi jest niedozwolony");
        }
    }

    @Override
    public void feed(Double foodweight) {

    }
}




