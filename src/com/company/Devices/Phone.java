package com.company.Devices;

import com.company.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;
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
    public void installAnApp(List<String> appNames){
        System.out.println("Instalowanie aplikacji z listy");
        for(String appName : appNames){
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName, String version){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName + " i wersji: " + version);
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }
    public void installAnApp(String appName, String version, String server){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName + " i wersji: " + version + " z servera: " + server);
        try {
            URL url = new URL(DEFAULT_PROTOCOL_SERVER, server, DEFAULT_PORT_SERVER, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            System.out.println(" Nie udało sie zainstalować aplikacji" + appName);
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url){
        System.out.println("Sprawdzanie adresu docelowego");
        System.out.println("Sprawdzanie rozmiaru aplikacji");
        System.out.println("Sprawdzanie miejsca na telefonie");
        System.out.println("Obsluga platnosci");
        System.out.println("Pobieranie aplikacji");
        System.out.println("Rozpakowywanie aplikacji");
        System.out.println("Instalacja");
    }
}




