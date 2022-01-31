package com.company;

import com.company.Devices.*;
import creature.Animal;
import creature.Pet;


public class Main {

    public static void main(String[] args) {

        LPG fiat = new LPG("Fiat", "Bravo", 2016, "grey", 3920);
        LPG passerati = new LPG("VW", "Passat", 2004, "black", 5400);

        Phone iphone = new Phone("Apple", "S", 2017, 4.3, 3, 5000);
        Phone xiaomi = new Phone("xiaomi", "mi8", 2018, 6.8, 8, "Android", "black", 1600);

        System.out.println("model: " + fiat.model);
        System.out.println("rok produkcji: " + fiat.yearOfProduction);
        System.out.println(fiat);

        System.out.println(iphone.getRamSize());
        System.out.println(xiaomi.getRamSize());

        Human me = new Human();
        System.out.println(me.getSalary());

        me.setSalary(700.0);

        me.feed();
        me.takeForAWalk();
        System.out.println(me.getSpecies());
        System.out.println(me.getWeight());
        System.out.println(me.firstName);

        System.out.println(fiat.getAge());


        Animal cat = new Pet("Lucky");

        fiat.turnOn();
        fiat.isTurnedOn();
        iphone.turnOn();
        iphone.isTurnedOn();

        Human borat = new Human();

        borat.cash =15000.0;
        //me.car = fiat;
        me.pet = cat;
        me.mobile = iphone;
        me.human1 = me;

        fiat.sale(me,borat, 10000);
        iphone.sale(me, borat, 5000);
        cat.sale(me, borat, 6000);
        me.sale(me, borat, 8000);

        Disel audi  = new Disel("Audi", "A6", 2013, "White", 1500);
        Electric nissan = new Electric("Nissan", "Leaf", 2021, "Black", 3000);
        LPG dacia = new LPG("Dacia", "Duster", 2018, "Orange", 4200);

        audi.Refuel();
        nissan.Refuel();
        dacia.Refuel();

        audi.value = 7000.00;
        nissan.value = 150000.00;
        dacia.value = 5000.0;

        Human Andrzej = new Human ();
        Human Borat = new Human();
        Human Pablo = new Human();
        Andrzej.name = "Andrzej";
        Borat.name = "Borat";
        Pablo.name = "Pablo";

       // System.out.println(Andrzej.FreeParkingSpace());
        //Andrzej.addCar(nissan);
        //Andrzej.addCar(nissan);
       // Andrzej.addCar(audi);
       // Andrzej.addCar(audi);
       // Andrzej.addCar(dacia);
        //Andrzej.addCar(dacia);
       // Andrzej.addCar(audi);
       // Andrzej.removeCar(dacia);

        //System.out.println(Andrzej.hasCar(audi));
        //System.out.println(" Wartość samochodów w garażu wynosi" + " " + Andrzej.getGarageValue() + " pln ");

        //Borat.addCar(dacia);
        //Borat.addCar(nissan);
        //Borat.addCar(audi);

       // audi.sale(Andrzej, Borat, 7000.0);

        Borat.cash = 15100.0;
        Andrzej.cash = 60000.0;
        Pablo.cash = 5.0;
        System.out.println(" ");

        //System.out.println("Pieniądze jakimi dysponuje Borat przed zakupem " + Borat.cash + "pln");
        //System.out.println("Pieniądze jakie posiada Andrzej przed zakupem " + Andrzej.cash + "pln");
        //System.out.println(" ");
        //audi.sale(Andrzej,Borat,7000.0);
        //System.out.println(" ");
        //System.out.println("Ilosc pieniedzy Borata po transakcji " + Borat.cash + "pln");
        //System.out.println("Ilosc pieniedzy w portfelu Andrzeja po transakcji " + Andrzej.cash + "pln");
        //System.out.println(" ");
        //audi.sale(Pablo, Andrzej, 7000.0);
        //System.out.println(" ");
        //Andrzej.cash = 1000.0;
        //dacia.sale(Borat, Andrzej, 500.0);
        //System.out.println(" ");
        //Andrzej.ListOfCars();
        //System.out.println(" ");
        //Borat.ListOfCars();
        //System.out.println(" ");
        //Pablo.ListOfCars();
        //System.out.println(" ");
        //Andrzej.CarsSort();
        //System.out.println(" ");
        //Borat.CarsSort();
        //System.out.println(" ");
        //Pablo.CarsSort();
        //System.out.println(" ");
        //System.out.println(" ");

        Application office = new Application("Pakiet office", 999.9, 600.0);
        Application photoEd = new Application("PhotoEdit", 2.0, 60.0);
        Application meta = new Application("Instagram", 10.1, 0.0);
        System.out.println("ILOSC PIENIEDZY Przed " + Andrzej.cash + " pln");
        xiaomi.installThisApp(Andrzej, office);
        System.out.println("ILOSC PIENIEDZY po " + Andrzej.cash + " pln");
        System.out.println(" ");
        xiaomi.freeApps();
        System.out.println(" ");
        xiaomi.installThisApp(Andrzej, meta);
        System.out.println(" ");
        xiaomi.freeApps();
        System.out.println(" ");
        System.out.println(" Wartość aplikacji na urządzeniu " + xiaomi.yourAppsValue() + " pln ");
        System.out.println(" ");
        iphone.installThisApp(Pablo, photoEd);
        System.out.println(" ");
        xiaomi.installThisApp(Andrzej, photoEd);
        System.out.println(" ");
        xiaomi.listOfApp();
        System.out.println(" ");
        System.out.println(" Posiadasz taką aplikacje na telefonie ? " + xiaomi.doYouHaveThisApp(meta));
    }
    }