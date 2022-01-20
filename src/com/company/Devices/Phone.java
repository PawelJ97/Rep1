package com.company.Devices;

public class Phone extends Device {
    final Double screenSize;
    String os;
    String colour;
    private final Integer ramSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize) {
        super(producer, model, yearOfProduction,"black");
        this.screenSize = screenSize;
        this.ramSize = ramSize;
    }

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize, String os, String colour) {
        super(producer, model, yearOfProduction, colour);
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
        return false;
    }
}




