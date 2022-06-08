package com.company;

public class Bike extends Vehicle{
    public Integer pilot;
    public String color;

    /**
     *Constructor
     * @param registration registration date
     * @param color bike color
     */

    public Bike(String registration, String color){
        this.passengers = 0;
        this.registration = registration;
        this.wheels = 2;
        this.pilot = 1;
        this.color = color;
        this.fuelType = "None";
    }


    /**
     * Print toString
     * @return String type to print in that way the Array
     */
    @Override
    public String toString(){
        return "Bike Type: \n" + "Color: " + color + " Pilot: " + pilot + " Fuel: " + fuelType + " Date: " + registration +"\n";
    }
}
