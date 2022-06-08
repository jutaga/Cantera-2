package com.company;

import java.util.Scanner;

/**
 * Main random numbers and ordenate them with different ways
 */
public class Main {
    public static Integer [] randomNumbers = new Integer[10];
    private static Boolean continues = true;
    private static final Scanner getInt = new Scanner(System.in);

    public static void main(String[] args) {

        while (continues){
            System.out.println("\nORDENATE NUMBERS USING THE FOLLOWING METHOD: ");
            System.out.println("1. BUBBLE SORT ");
            System.out.println("2. QUICK SORT");
            System.out.println("3. RE-GENERATE RANDOM NUMBERS");
            System.out.println("4. DISCONNECT");
            System.out.print("RANDOM NUMBERS: ");

            for (int i = 0; i < randomNumbers.length ; i++) {
                randomNumbers[i] = (int)Math.floor(Math.random()*(11-1)+1);  //(int) (Math.random()*(max-min)) + min;
            }
            for (Integer randomNumber : randomNumbers) {
                System.out.print(randomNumber + " ");
            }
            System.out.print("\nWRITE HERE: ");
            int option = getInt.nextInt();

            switch (option){
                case 1:
                    for (int i = 0; i < randomNumbers.length - 1 ; i++) {
                        for (int j = 0; j < randomNumbers.length-1; j++) {
                            if (randomNumbers[j] > randomNumbers[j+1]){ //if current number > nextNumber
                                int aux = randomNumbers[j];
                                randomNumbers[j] = randomNumbers[j+1];
                                randomNumbers[j+1] = aux;
                            }
                        }
                    }
                    System.out.print("BUBBLE SORT: ");
                    for (Integer randomNumber : randomNumbers) {
                        System.out.print(randomNumber + " ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < randomNumbers.length ; i++) {
                        int position = i;
                        int aux = randomNumbers[i];

                        while((position > 0) && (randomNumbers[position-1] > aux)){
                            randomNumbers[position] = randomNumbers[position-1];
                            position--;
                        }
                        randomNumbers[position] = aux;
                    }
                    System.out.print("QUICK SORT: ");
                    for (Integer randomNumber : randomNumbers) {
                        System.out.print(randomNumber + " ");
                    }
                    break;
                case 3:
                    continue;
                case 4:
                    System.out.println("DISCONNECTED");
                    continues = false;
                    break;

                default:
                    System.out.println("NO VALID OPTION");
                    break;
            }
        }
    }
}
