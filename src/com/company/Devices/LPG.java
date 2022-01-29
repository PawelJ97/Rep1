package com.company.Devices;

public class LPG extends Car{
        public LPG(String producer, String model, Integer yearOfProduction, String colour) {
                super(producer, model, yearOfProduction, colour);
        }

        @Override
        public void Refuel() {
                System.out.println("you refuel your car using gas");
        }

}
