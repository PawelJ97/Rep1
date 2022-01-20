package com.company.Devices;

public class Car extends Device {

    public Double engineVolume;
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour );
        this.engineVolume = 1.9;

    }

    public String toString()
    {
        return "Producer: " + this.producer + " model: " + this.model + "rok produkcji: " + this.yearOfProduction;
    }
}
