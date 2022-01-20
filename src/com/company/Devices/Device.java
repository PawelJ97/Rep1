package com.company.Devices;

public class Device {

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

}
