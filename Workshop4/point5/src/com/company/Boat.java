package com.company;

/**
 * Boat class
 */
public class Boat extends Vehicle{
    public String color;
    public String boatType;
    public Double shipment;

    /**
     * Boat constructor with some specifics attributes
     * @param passengers amount of passengers
     * @param presence empty o with any person
     * @param color boat Color
     * @param boatType what boat it is
     * @param shipment capacity
     */
    public Boat(Integer passengers,Boolean presence, String color, String boatType, Double shipment) {
        this.passengers = passengers;
        this.road = "Water";
        this.presence = presence;
        this.color = color;
        this.boatType = boatType;
        this.shipment = shipment;
    }

    /**
     * Print toString
     * @return String type to print in that way the Array
     */

    @Override
    public String toString(){
        return "Boat type: \n" + boatType + " Color: " +color + "Road: " + road + " Capacity: " + shipment+"\n";
    }
}
