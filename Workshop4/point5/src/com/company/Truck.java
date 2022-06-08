package com.company;

/**
 * Truck class based on vehicle abstract
 */

public class Truck extends Vehicle{
    public Integer seats;
    public Double motorPower;
    public Integer windows;
    public Integer pilot;
    public Integer bed;
    public Double shipment;

    /**
     * Truck Constructor with some extra attributes
     * @param shipment capacity
     * @param motorPower potency of the truck
     * @param windows amount of windows the truck has
     * @param presence to check if the car has any person
     * @param registration date of creation
     * @param wheels amount of truck's wheels
     */

    public Truck(Double shipment, Double motorPower, Integer windows, Boolean presence, String registration,Integer wheels){
        this.shipment = shipment;
        this.motorPower = motorPower;
        this.bed = 1;
        this.seats = 2;
        this.windows = windows;
        this.wheels = wheels;
        this.passengers = pilot;
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
        return "Truck Type: \n" + "Wheels: " + wheels + " Pilot: " + pilot + " Bed to rest: " + bed  +" seats: " + seats + " Capacity: " + shipment + " Kg" + ", Fuel: " + fuelType +"\n";
    }

}
