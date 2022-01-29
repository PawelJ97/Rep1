package com.company;

import com.company.Devices.*;
import creature.Animal;
import creature.Pet;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        LPG fiat = new LPG("Fiat", "Bravo", 2016, "grey");
        LPG passerati = new LPG("VW", "Passat", 2004, "black");

        Phone iphone = new Phone("Apple", "S", 2017, 4.3, 3);
        Phone xiaomi = new Phone("xiaomi", "mi8", 2018, 6.8, 8, "Android", "black");

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

        Human brotherInLow = new Human();

        brotherInLow.cash =15000.0;
        me.car = fiat;
        me.pet = cat;
        me.mobile = iphone;
        me.human1 = me;

        fiat.sale(me,brotherInLow, 10000);
        iphone.sale(me, brotherInLow, 5000);
        cat.sale(me, brotherInLow, 6000);
        me.sale(me, brotherInLow, 8000);

        iphone.installAnApp("messenger");
        iphone.installAnApp("youtube","last");

        List<String> apps = new ArrayList<>();
        apps.add("fb");
        apps.add("gmail");
        apps.add("office");
        xiaomi.installAnApp(apps);

        Disel audi  = new Disel("Audi", "A6", 2013, "White");
        Electric nissan = new Electric("Nissan", "Leaf", 2021, "Black");
        LPG dacia = new LPG("Dacia", "Duster", 2018, "Orange");

        audi.Refuel();
        nissan.Refuel();
        dacia.Refuel();



    }
    }