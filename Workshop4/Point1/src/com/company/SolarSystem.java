package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solar system , where planets will interact
 *
 * @version 1.01.001 2022-06-06
 *
 * @author Juan pablo tabares gallego
 *
 * @since 1.01.001
 */
public class SolarSystem {
    private static boolean continues = true;
    public static int option, chosen, chosen1;
    public static double result,distance;
    private static final Scanner getInt = new Scanner(System.in);
    private static final Scanner getDouble = new Scanner(System.in);
    public static ArrayList<Planet> myPlanets = new ArrayList<>();

    public static void main(String[] args) {
        myPlanets.add(new Planet((5.972*Math.pow(10,24)),5.51,12742,16047,"Earth",1));
        myPlanets.add(new Planet((5.683*Math.pow(10,26)),687,116460,886,"Saturn",2));
        myPlanets.add(new Planet((1.25*Math.pow(10,22)),1750,2376.6,59064,"Pluto",3));
        myPlanets.add(new Planet((3.683*Math.pow(10,23)),5.43,4879.4,460012,"Mercury",4));
        myPlanets.add(new Planet((4.867*Math.pow(10,24)),5.24,12104,108000,"Venus",5));


        do{
            System.out.println("SOLAR SYSTEM APP: ");
            System.out.println("1. Calculate gravitational attraction");
            System.out.println("2. Available Planets List");
            System.out.println("3. Exit");
            System.out.print("WRITE OPTION: ");
            option = getInt.nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.println("AVAILABLE PLANETS");
                        for (Planet myPlanet : myPlanets) {
                            System.out.println(myPlanet);
                        }
                        System.out.print("1st planet:");
                        chosen = getInt.nextInt();
                        if(chosen > 0 && chosen < 6){
                            System.out.print("2nd planet:");
                            chosen1 = getInt.nextInt();
                            if(chosen1 > 0 && chosen1 < 6){
                                System.out.print("Write Distance Between them in Million KM: ");
                                distance = getDouble.nextDouble();
                                result = (myPlanets.get(chosen-1)).gravitationalAttraction((myPlanets.get(chosen-1).getMass()), (myPlanets.get(chosen1-1).getMass()), distance);
                                System.out.println("Gravitational attraction between: " + myPlanets.get(chosen-1).getPlanetName() + " and " + myPlanets.get(chosen1-1).getPlanetName() + " = " + result + " m/s2");
                            }else {
                                System.out.println("PLANET 2 NO VALID");
                            }
                        }else{
                            System.out.println("PLANET 1 NO VALID");
                        }
                    }
                    case 2 -> {
                        System.out.println("AVAILABLE PLANETS");
                        for (Planet myPlanet : myPlanets) {
                            System.out.println(myPlanet);
                        }
                    }
                    case 3 ->{
                        continues = false;
                        System.out.println("SOLAR APP DISCONNECTED");
                    }
                    default -> System.out.println("INVALID OPTION\n");
                }
        }while(continues);
    }
}
