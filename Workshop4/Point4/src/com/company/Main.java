package com.company;
import java.util.Scanner;

/**
 * Creating vehicles
 *
 * @version 1.001.001 06/06/2022
 *
 * @author Juan pablo tabares gallego
 *
 * @since 1.001.001
 */
public class Main {
    public static boolean continues = true;
    public static int options;
    public static Vehicle[] vehicles = new Vehicle[10];
    private static final Scanner getInfo = new Scanner(System.in);
    private static final Scanner getString = new Scanner(System.in);

    public static void main(String[] args) {

        while (continues){
            System.out.println("1. Creates 10 vehicles");
            System.out.println("2. Vehicle List");
            System.out.println("3. Disconnect");
            options = getInfo.nextInt();

            if(options == 1){

                for (int i = 0; i < vehicles.length; i++) {
                    System.out.println((i+1) + ". " + "Vehicle");
                    System.out.print("PASSENGERS:");
                    int passengers = getInfo.nextInt();
                    boolean presence = passengers > 0;
                    System.out.print("WHEELS: ");
                    int wheels = getInfo.nextInt();
                    System.out.print("REGISTRATION DATE: dd/mm/yyyy: ");
                    String date = getString.nextLine();
                    System.out.print("ROAD: ");
                    String road = getString.nextLine();
                    vehicles[i] = new Vehicle(passengers,presence,wheels,date,road);
                }

            } else if (options == 2) {
                for (Vehicle vehicle : vehicles) {
                    if (vehicle == null) {
                        System.out.println("LIST IS EMPTY");
                    } else {
                        System.out.println(vehicle);
                    }
                }

            } else if (options == 3) {
                System.out.println("DISCONNECTED");
                continues = false;
            }else {
                System.out.println("NO VALID OPTION");
            }
        }
    }
}
