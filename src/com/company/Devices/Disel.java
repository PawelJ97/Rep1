package com.company.Devices;

public class Disel extends Car{
    public Disel(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }
    public void Refuel() {
        System.out.println("you refuel your car using oil ");
    }
}
