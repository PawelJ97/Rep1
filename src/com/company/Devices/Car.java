package com.company.Devices;

import com.company.Human;
import com.company.Saleable;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Saleable {

    public Double engineVolume;
    public double value;
    public List<Human> carOwners;
    public List<Human> presentOwner;
    public List<Human> purchaser;
    public List<Human> dealers;
    public List<String> deals;

    public Car(String producer, String model, Integer yearOfProduction, String colour, double value) {
        super(producer, model, yearOfProduction, colour, value);
        this.engineVolume = 1.9;

        this.carOwners = new ArrayList<>();
        this.presentOwner = new ArrayList<>();
        this.purchaser = new ArrayList<>();
        this.dealers = new ArrayList<>();
        this.deals = new ArrayList<>();

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
        } else if (seller == presentOwner){
            System.out.println(" Nie jesteś właścicielem tego pojazdu");}
            else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            this.dealers.add(seller);
            this.carOwners.add(buyer);
            this.purchaser.add(buyer);
            this.deals.add(" Transakcja między " + seller.name + " a " + buyer.name);
            System.out.println("Gratulacje !!" + seller.name + " Auto zostało sprzedane za " + price + " pln" + " Nowym właścicielem jest " + buyer.name);
        }
    }
    public abstract void Refuel();

    public void OwnersOfCar(){
        System.out.println("Lista właścicieli tego pojazdu to : " + this);
        int amount = 1;
        if(carOwners.size() == 0)
        {
            System.out.println("Nie ma żadnych właścicieli");
        }else {
            for (Human human : carOwners) {
                if(amount == carOwners.size()){
                    System.out.println(amount + " " + this.presentOwner + " - " + " Wlaściciel pojazdu");
                }else{
                    System.out.println(amount + " " + human.name);
                    amount += 1;
                }
            }
        }
    }
    public boolean OwnersCheck(){
        return carOwners.size() > 0;
    }

    public boolean SellingCheck(Human seller, Human buyer){
        for (int i = 0; i < HowManyDeals(); i++) {
            if(dealers.contains(seller) && purchaser.contains(buyer))
                if(dealers.get(i) == seller && purchaser.get(i) == buyer){
                    return true;
                }
        }
        return false;
    }
    public int HowManyDeals(){
        int amount = 0;
        for (String a : deals) {   //For( variable : arrayname)
            amount += 1;
        }
        return amount;
    }
}
