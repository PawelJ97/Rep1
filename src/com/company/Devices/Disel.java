package com.company.Devices;

public class Disel extends Car{
    public Disel(String producer, String model, Integer yearOfProduction, String colour, double value) {
        super(producer, model, yearOfProduction, colour, value);
    }
    public void Refuel() {
        System.out.println("you refuel your car using oil ");
    }
}
