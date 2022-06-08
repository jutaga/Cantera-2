package com.company;

/**
 * Car class based on vehicle abstract
 */
public class Car extends Vehicle {
    public Double motorPower;
    public Integer seats;

    public Integer windows;
    public Integer pilot;

    /**
     * Constructor with some extra attributes
     * @param motorPower motor potency
     * @param seats seats the car has
     * @param windows amount of car's windows
     * @param passengers amount of passengers
     * @param presence empty o with any person
     * @param registration creation date
     */
    public Car(Double motorPower, Integer seats, Integer windows,Integer passengers, Boolean presence, String registration){
        this.motorPower = motorPower;
        this.seats = seats;
        this.windows = windows;
        this.wheels = 4;
        this.passengers = passengers;
        this.presence = presence;
        this.pilot = 1;
        this.registration = registration;
        this.road = "highway";
        this.fuelType = "Gasoline";
    }

    /**
     * Print toString
     * @return String type to print in that way the Array
     */
    @Override
    public String toString(){
        return "Car Type: \n" + "Wheels: " + wheels + " Pilot: " + pilot + " Windows: " + windows  +" seats: " + seats + " Fuel: " + fuelType+"\n";
    }
}




