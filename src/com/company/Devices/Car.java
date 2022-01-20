package com.company.Devices;

public class Car extends Device {

    public Double engineVolume;
    public String plates;

    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour );
        this.engineVolume = 1.9;

    }

    @Override
    public void turnOn() {
        System.out.println(" Przekręcam kluczyk");
        System.out.println("Silnik został odpalony");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }

    public String toString()
    {
        return "Producer: " + this.producer + " model: " + this.model + "rok produkcji: " + this.yearOfProduction;
    }
}
