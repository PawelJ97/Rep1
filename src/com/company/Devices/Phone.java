package com.company.Devices;

import com.company.Application;
import com.company.Human;
import com.company.Saleable;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Device implements Saleable {
    private static final String DEFAULT_APP_VERSION = "last";
    private static final String DEFAULT_APP_SERVER = "appforyou.com";
    private static final int DEFAULT_PORT_SERVER = 18;
    private static final String DEFAULT_PROTOCOL_SERVER = "https";
    final Double screenSize;
    String os;
    String colour;
    private final Integer ramSize;
    public List<Application> applicationList;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize, double value) {
        super(producer, model, yearOfProduction, "black", 3000);
        this.screenSize = screenSize;
        this.ramSize = ramSize;
    }

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize, String os, String colour, double value) {
        super(producer, model, yearOfProduction, colour, value);
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.os = os;
        this.applicationList = new ArrayList<>();
    }

    public String getRamSize() {
        return this.ramSize + "GB";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void turnOn() {
        System.out.println("Wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("Telefon został uruchomiony");
    }

    public boolean isTurnedOn() {
        return true;
    }


    @Override
    public void sale(Human seller, Human buyer, double price) {
        if (buyer.cash < price) {
            System.out.println("Brak środków");
        } else if (seller.mobile != this) {
            System.out.println("Nie posiadasz telefonu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("Udało się sprzedać telefona za cene " + price + "pln");
        }
    }

    public void installThisApp(Human owner, Application appName) {
        if (owner.cash < appName.price) {
            System.out.println("Brak środków na zakupienie aplikacji");
            appName.InstalationApp = false;
        }
        if (owner.cash > appName.price) {
            if (applicationList.contains(appName)) {
                System.out.println("Ta aplikacja jest juz zainstalowana - " + appName.name);
            } else {
                applicationList.add(appName);
                owner.cash -= appName.price;
                System.out.println("Sprawdzanie czy wystarczy pamięci");
                System.out.println("Transakcja - Kupiono produkt ");
                System.out.println("Pobieranie - Prosze czekac");
                System.out.println("Instalacja - Zainstalowano");
                appName.InstalationApp = true;
            }
        }
    }

    public void listOfApp() {
        for (Application q : applicationList)
            System.out.println(q.appName);
    }

    public boolean doYouHaveThisApp(Application appName) {
        for (Application q : applicationList) {
            if (q == appName) {
                return true;
            }
        }
        return false;
    }

    public void freeApps() {
        System.out.println("Darmowe Aplikacje, które posiadasz na telefonie");
        for (Application q : applicationList) {
            if (q.price <= 0.0) {
                System.out.println(" ---> " + q.appName);
            }
        }
    }

    public Double yourAppsValue() {
        double cost = 0.0;
        for (Application q : applicationList) {
            cost += q.price;
        }
        return cost;
    }
}


