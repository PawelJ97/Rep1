package com.company;

public class Animal implements Saleable {
    final static Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_WEIGHT = 1.0;

    final String species;
    Double weight;
    String name;
    Boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }

    void feed() {
        if (this.isAlive) {
            this.weight += 1;
            System.out.println("Thank you for food");
        } else {
            System.out.println(" its too late");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight -= 1;
            System.out.println("that was nice walk :D");
            if (this.weight <= 0) {
                this.isAlive = false;
            }
        } else {
            System.out.println("ANIMAL IS DEAD ");
        }
    }

    @Override
    public void sale(Human seller, Human buyer, double price) {
        if(buyer.cash < price){
            System.out.println("Brak środków");
        } else if (seller.pet != this){
            System.out.println("Nawet nie masz zwierzaka");
        } else  {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Udało się sprzedać zwierzaka za cene " + price + "pln");
        }

    }
}

