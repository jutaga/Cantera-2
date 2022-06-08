package com.company;
import java.util.Scanner;
import java.util.Vector;

/**
 * @version 1.001.001
 *
 * @author Juan pablo tabares gallego 07/06/2022
 *
 * @since  1.001.001
 */
public class Main {
    static public int num1;
    static public Vector<Object> numbers;
    private static final Scanner getInt = new Scanner(System.in);


    public static void main(String[] args) {
        numbers = new Vector<>();

        System.out.println("WRITE NUMBERS , IF THEY'RE EQUALS ,\nPROGRAM WILL STOP AND PRINT THE LIST");

        for(int i = 0; i < 10; i++) {
            System.out.print("WRITE NUMBER TO ADD: ");
            num1 = getInt.nextInt();
            numbers.addElement(num1);

            if(i > 0){
                if((int)numbers.elementAt(i-1) == num1){
                    for (int j = 0; j < numbers.size(); j++) {
                        System.out.println(numbers.elementAt(j));
                    }
                    i = 9;
                }
            }
            if(numbers.size() == 10){
                System.out.println("THE LIST IS FULL");
            }
        }
    }
}
