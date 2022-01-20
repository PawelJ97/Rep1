package com.company.Devices;

abstract public class Device {

        protected final String producer;
        public final String model;
        public final Integer yearOfProduction;
        public String colour;

        public Device(String producer, String model, Integer yearOfProduction, String colour) {
            this.producer = producer;
            this.model = model;
            this.yearOfProduction = yearOfProduction;
            this.colour = colour;
        }

        public Integer getAge(){
            return 2021 - yearOfProduction ;
    }
        abstract public void turnOn();
        abstract public boolean isTurnedOn();

}
