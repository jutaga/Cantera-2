package Spacecrafts;
import java.util.Scanner;

/**
 * Main to create the spacecrafts based on different type of classes
 */
public class Main {
    /**
     * Variables to get some values from console
     */
    private static boolean continues = true;
    private static final Scanner getNum = new Scanner(System.in);
    private static final Scanner getString = new Scanner(System.in);
    public static double option, speed , power, capacity, height;
    public static String name , fuelType;


    public static void main(String[] args) {

        do {
            System.out.println("1. Create a spacecraft");
            System.out.println("2. Disconnect server");
            option = getNum.nextInt();

            if(option == 1){
                System.out.println("1. Unmanned");
                System.out.println("2. Manned");
                System.out.println("3. Shuttle");
                option = getNum.nextInt();
                switch ((int) option) {
                    case 1 -> {
                        System.out.println("Creating an Unmanned Ship");
                        System.out.println("Write Unmanned's Speed");
                        speed = getNum.nextDouble();
                        System.out.println("Write Unmanned's Power");
                        power = getNum.nextDouble();
                        System.out.println("Write Your Ships's Name");
                        name = getString.nextLine();
                        System.out.println("Write Unmanned's Capacity (PEOPPLE)");
                        capacity = getNum.nextDouble();
                        Unmanned ship = new Unmanned(power, speed, name.toUpperCase(), capacity);
                        if (ship.functional()) {
                            ship.shipDetails("Unmanned");
                            ship.flying(ship.name);
                        } else {
                            System.out.println("THE SHIP WON'T BE FUNCTIONAL");
                        }
                    }
                    case 2 -> {
                        System.out.println("Creating a Manned Ship");
                        System.out.println("Write Your Ships's Name");
                        name = getString.nextLine();
                        System.out.println("Write Unmanned's Fuel Type");
                        fuelType = getString.nextLine();
                        System.out.println("Write Unmanned's speed");
                        speed = getNum.nextDouble();
                        System.out.println("Write Your Ships's Height");
                        height = getNum.nextDouble();
                        Manned ship1 = new Manned(fuelType, speed, height, name.toUpperCase());
                        if (ship1.functional()) {
                            ship1.shipDetails("Manned");
                            ship1.flying(ship1.name);
                        } else {
                            System.out.println("THE SHIP WON'T BE FUNCTIONAL");
                        }
                    }
                    case 3 -> {
                        System.out.println("Creating a Shuttle Ship");
                        System.out.println("Write Your Ships's Name");
                        name = getString.nextLine();
                        System.out.println("Write Unmanned's Fuel Type");
                        fuelType = getString.nextLine();
                        System.out.println("Write Unmanned's speed");
                        speed = getNum.nextDouble();
                        System.out.println("Write Your Ships's Height");
                        height = getNum.nextDouble();
                        System.out.println("Write Unmanned's Power");
                        power = getNum.nextDouble();

                        Shuttle ship2 = new Shuttle(fuelType, speed, height, name, power);

                        if (ship2.functional()) {
                            ship2.shipDetails("Manned");
                            ship2.flying(ship2.name);
                        } else {
                            System.out.println("THE SHIP WON'T BE FUNCTIONAL");
                        }
                    }
                    default -> System.out.println("ERROR , TRY AGAIN");
                }
            }else if(option == 2){
                System.out.println("SERVER DISCONNECTED");
                continues = false;
            }else {
                System.out.println("ERROR , TRY AGAIN");
            }
        }while(continues);
    }
}
