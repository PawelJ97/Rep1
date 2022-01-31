package com.company;

import com.company.Devices.Car;
import com.company.Devices.Phone;
import creature.Animal;

import java.util.Arrays;
import java.util.Objects;

public class Human extends Animal {

    private static final int DEFAULT_GARAGE_SIZE = 5;
    public String firstName;
    public String name;
    private Double salary;
 // private double salary;
    public Double cash;
    public Car[] garage;
    public Phone mobile;
    public Animal pet;
    public Human human1;


    public Human() {
        super("homo sapiens");
       // this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
        String name = firstName;
    }
   // public Double getSalary() {
     //   return salary;
    //}

   // public void setSalary(Double salary) {
      //  if(salary <= 0){
      //      System.out.println("Wartość nie może być ujemna ani równa zero");
     //   }else{
     //       System.out.println("dane wyslane zostały do systemu ksiegowego");
     //       System.out.println("Proszę odebrac aneks w dziale kadr - zgłosić się do pani Hani");
     //       System.out.println("ZUS i US został wie o zmianie wypłaty - proszę nie dokonywać zmian");
     //       this.salary = salary;
    //    }
  //  }

    @Override
    public void feed(Double foodweight) {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
            this.salary = salary;
        }

    public Car getCar(Integer spot) {
        if (spot != null) {
            return garage[spot];
        } else {
            return null;
        }
    }

    public void setCar(Car car, int spot) {
        if (salary > car.value) {
            if (garage[spot] != null) {
                this.garage[spot] = car;
                car.carOwners.add(this);
                System.out.println("Udało ci się zakupić nowe autko!!");
            } else {
                System.out.println("To miejsce jest zajete !!");
            }
        } else if (salary > (car.value /12)) {
            if (garage[spot] != null) {
                this.garage[spot] = car;
                System.out.println("Mało pieniedzy...Kredyt ;c ?!");
            }
        }
            }
    public boolean hasCar(Car newCar) {
        for (Car car : this.garage) {
            if (car != null && car.equals(newCar)) {
                return true;
            }
        }
        return false;
    }

    public boolean FreeParkingSpace() {
        for (Car car : garage) {
            if (car == null)
                return true;
            }

        return false;
    }

    public Double removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println("Usunieto samochod " + car.model + " " + car.yearOfProduction +" z twojego garazu");
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz takiego auta w garazu");
                }
            }
        }
        return null ;
    }
    public void addCar(Car car) {
        {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = car;
                    System.out.println("Dodano auto do garazu w miejsce garażowe nr: " + i);
                    i = this.garage.length;
                } else {
                    if (i == this.garage.length - 1) {
                        System.out.println("Zabrakło ci miejsca w garażu...Przykro mi");
                    }
                }
            }

        }
    }
    public Double getGarageValue() {
        Double value = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                value += car.value;
            }
        }
        return value;
    }
    public void ListOfCars() {
        int amount = 0;
        System.out.println("Oto lista samochodów, które znajdują się w garażu ");
        for (Car car : garage) {
            if (car != null) {
                amount += 1;
            }
        }
        if (amount > 0) {
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    System.out.println(garage[i]);
                } else {
                    System.out.println("Puste miejsce w garażu to nr." + i);
                }
            }
        } else {
            System.out.println("Nie posiadasz żadnego auta w tym garażu");
        }
    }
    public void CarsSort() {
        Car temp;
        int carNumber = 0; //
        Car[] tempGarageSlot = new Car[DEFAULT_GARAGE_SIZE];
        for (Car car : garage) {
            if (car != null) {
                carNumber += 1;
            }
        }
        int arrayLp = 0;
        Integer[] tempArray = new Integer[carNumber];
        for (Car car : garage) { //
            if (car != null) {
                tempArray[arrayLp] = car.yearOfProduction;
                arrayLp += 1;
            }
        }
        Arrays.sort(tempArray); //
        for(int i = 0; i < tempArray.length; i++){
            for (Car car : garage) {
                if (car != null && Objects.equals(tempArray[i], car.yearOfProduction)) {
                    temp = car;
                    tempGarageSlot[i] = temp;
                }
            }
        }
        garage = tempGarageSlot;

    }
    }








