package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates a list of any kind of vehicles the user choces
 * @version 1.001.001 07/06/2022
 *
 * @author Juan pablo tabares gallego
 *
 * @since 1.001.001
 */
public class Main {

   static ArrayList<Vehicle> vehiclesList = new ArrayList<>();

    static Boolean continues = true;
    static public Integer option;

    private static final Scanner getInt = new Scanner(System.in);
    private static final Scanner getDouble = new Scanner(System.in);
    private static final Scanner getString = new Scanner(System.in);

    public static void main(String[] args) {

        while(continues){
            option = mainMenu();
            switch (option){
                case 1:
                    vehiclesList.add(new Truck(capacity("Truck"," capacity"),capacity("Truck"," Motor Potency"),amount("Windows"),true,date(),amount("Wheels")));
                    break;
                case 2:
                    vehiclesList.add(new Bike(date(),choosingColor()));
                    break;
                case 3:
                    vehiclesList.add(new Car(capacity("Car","Motor Potency"),amount("seats"),amount("Windows"),amount("passengers"),true,date()));
                    break;
                case 4:
                    vehiclesList.add(new Boat(amount("passengers"),true,choosingColor(),boatType(),capacity("Boat","Capacity")));
                    break;
                case 5:
                    vehiclesList.add(new Motorcycle(choosingColor(),capacity("motorcycle","Power"),"highway"));
                    break;
                case 6:
                    if(vehiclesList.size() == 0){
                        System.out.println("LIST IS EMPTY");
                    }else {
                        System.out.println("LIST CONTAINS: ");
                        for (int i = 0; i < vehiclesList.size(); i++) {
                            System.out.println((i+1) + ". " + vehiclesList.get(i));
                        }
                    }
                    break;
                case 7:
                    System.out.println("DISCONNECTED");
                    continues = false;
                default:
                    System.out.println("NO VALID, TRY AGAIN");
                    break;
            }
        }
    }


    /**
     * Main menu
     * @return a value taken by console
     */
    private static Integer mainMenu(){
        System.out.println("Vehicles app");
        System.out.println("What Vehicles would like to add?");
        System.out.println("1. Truck");
        System.out.println("2. Bike");
        System.out.println("3. Car");
        System.out.println("4. Boat");
        System.out.println("5. Motorcycle");
        System.out.println("6. Show List");
        System.out.println("7. Disconnect");
        System.out.print("WRITE HERE: ");
        return getInt.nextInt();
    }


    /**
     * Get a double value
     * @param typeClass to overwrite on text the name of class
     * @param attribute to overwrite on text the name of attribute
     * @return get a Double value;
     */
    private static Double capacity(String typeClass, String attribute){
        System.out.println("WRITE THE " + typeClass + attribute);
        return getDouble.nextDouble();
    }

    /**
     * to ask for a Integer value
     * @param attribute to overwrite on text the name of attribute
     * @return get a int value;
     */
    private static Integer amount(String attribute){
        System.out.println("Write the amount of: " + attribute);
        return getInt.nextInt();
    }

    /**
     * to ask for a date string
     * @return get a String value
     */
    private static String date(){
        System.out.println("DATE: dd/mm/yyyy");
        return getString.nextLine();
    }

    /**
     * to ask for a COLOR string
     * @return get a String value
     */
    private static String choosingColor(){
        System.out.println("COLOR: ");
        return getString.nextLine();
    }

    /**
     * to ask for a type boat string
     * @return get a String value
     */
    private static String boatType(){
        System.out.println("What boat is it? ");
        return getString.nextLine();
    }
}

