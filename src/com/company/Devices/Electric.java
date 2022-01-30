package com.company.Devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction, String colour, double value) {
        super(producer, model, yearOfProduction, colour, value);
    }

    @Override
    public void Refuel() {
        System.out.println("you refuel your car using electricity ");
    }
}
