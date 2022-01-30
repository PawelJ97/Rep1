package com.company.Devices;

import com.company.Human;
import com.company.Saleable;
import java.util.ArrayList;

public abstract class Car extends Device implements Saleable {

    public Double engineVolume;
    public String plates;
    public double value;

    public Car(String producer, String model, Integer yearOfProduction, String colour, double value) {
        super(producer, model, yearOfProduction, colour, value);
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
            System.out.println("Brak środków na koncie");
        } else if(!seller.hasCar(this) ){
            System.out.println(" Hej ! Przecież nie posiadasz takiego samochodu");
            } else  if (!buyer.FreeParkingSpace()) {
            System.out.println("Nie masz miejsca w garażu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Gratulacje !! Auto zostało sprzedane za " + price + "pln");
        }
    }
    public abstract void Refuel();
}
