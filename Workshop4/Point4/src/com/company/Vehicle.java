package com.company;

/**
 * Vehicle class with some main attributes
 */
public class Vehicle {
    public Integer passengers;
    public Boolean presence;
    public Integer wheels;
    public String registration;
    public String road;

    /**
     * constructos
     * @param passengers mount of people
     * @param presence if the vehicle is empty
     * @param wheels mount of wheels
     * @param registration date of registration
     * @param road way the vehicle will road
     */
    public Vehicle(Integer passengers, Boolean presence, Integer wheels, String registration, String road) {
        this.passengers = passengers;
        this.presence = presence;
        this.wheels = wheels;
        this.registration = registration;
        this.road = road;
    }


    /**
     * Method to check if the vehicle is empty
     * @param passengers mount of people inside
     * @return boolean value false if it's empty the vehicle , true if it has any mount
     */
    public Boolean presence(Integer passengers){
        presence = passengers > 0;
        return presence;
    }

    /**
     * Print toString
     * @return String type to print in that way the Array
     */
    @Override
    public String toString(){
        return "Passengers: " + passengers + ", Wheels: " + wheels + ", Registration: " + registration
                + " Road: " + road;
    }
}
