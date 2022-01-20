package com.company;

import com.company.Devices.Car;
import com.company.Devices.Device;
import com.company.Devices.Phone;


public class Main {

    public static void main(String[] args) {

        Car fiat = new Car("Fiat", "Bravo", 2016, "grey");
        Car passerati = new Car("VW", "Passat", 2004, "black");

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
        System.out.println(me.species);
        System.out.println(me.weight);
        System.out.println(me.firstName);

        System.out.println(fiat.getAge());

        Animal cat = new Animal("lucky");

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
    }
    }