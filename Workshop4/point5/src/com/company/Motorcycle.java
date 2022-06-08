package com.company;

/**
 * motorcycle class
 */

public class Motorcycle extends Vehicle {
    public String color;
    public Double power;

    /**
     * Motorcycle constructor
     * @param color cycle color
     * @param power motor potency
     * @param road the road the bike will run
     */
    public Motorcycle(String color, Double power, String road){
        this.color = color;
        this.power = power;
        this.fuelType = "Gasoline";
        this.passengers = 2;
        this.wheels = 2;
        this.road = road;
    }

    /**
     * Print toString
     * @return String type to print in that way the Array
     */

    @Override
    public String toString(){
        return " Motorcycle type: \n" + " Color: " +color + "Road: " + road + " Motor: " + power + "\n";
    }
}

