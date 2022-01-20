package com.company.Devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {

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
    public void sale(Human seller, Human buyer, double price){
        if (buyer.cash < price){
            System.out.println("Brak środków");
        } else if(seller.car != this){
            System.out.println("Nie posiadasz samochodu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Udało się sprzedać auto za " + price + "pln");
        }
    }
}
