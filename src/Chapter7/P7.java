package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to (Populate a given array with given number)
 *
 * @author LouisTran
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will your array have?");
        int userIn = input.nextInt();
        double[] Prime = new double[userIn];
        System.out.print("Enter in " + userIn + " array ");
        ArrayIn(Prime);
        double acutal = average(Prime);
        System.out.println("The average is " + acutal);
        System.out.println("The content of the array is " + Arrays.toString(Prime));
    }

    /**
     * Method that populates the array
     *
     * @param Prime it populates the array with the given input
     */
    public static void ArrayIn(double[] Prime) {
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < Prime.length; x++) {
            Prime[x] = input.nextDouble();
        }
    }

    /**
     * Method that finds the average of the array
     *
     * @param Prime (finds the average of all the numbers in the array)
     * @return(the average average of the numbers in the array)
     */
    public static double average(double[] Prime) {
        double y = 0;
        for (int x = 0; x < Prime.length; x++) {
            y = y + Prime[x];
        }
        return y / Prime.length;
    }
}
