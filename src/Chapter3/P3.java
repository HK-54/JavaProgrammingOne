package Chapter3;

import java.util.Scanner;

/**
 * \
 * Program to ( input two foods into the program choose which one is cheaper,
 * give it a rank, and if it is in range or out of range)
 *
 * @author Tran i7
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //cost of first food
        System.out.print("Enter in your cost first food-");
        double cost1 = input.nextDouble();
        // cost of second food
        System.out.print("Enter in your cost for second food-");
        double cost2 = input.nextDouble();
        if (cost1 > cost2) {
            System.out.println("food 1 is greater than food 2");
        }
        if (cost1 < cost2) {
            System.out.println("food 2 is greater than food 1");
        }
        if (cost1 == cost2) {
            System.out.println("food 1 is equall to food 2");
        }
        if (cost1 >= cost2) {
            System.out.println("food 1 is greater than or equall to food 2");
        }
        if (cost1 <= cost2) {
            System.out.println("food 2 greater than or equall to food 1");
        }
        if (cost2 == 0) {
            System.out.println("cannot divide by 0");
            if (cost1 / cost2 < 1) {
                System.out.println("proper funtion");
            } else {
                System.out.println("inproper funtion");
            }
        }
        if (cost1 >= 90) {
            System.out.println("A");
        }
        if (cost1 >= 80) {
            System.out.println("B");
        }
        if (cost1 >= 70) {
            System.out.println("C");
        }
        if (cost1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (cost2 == 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
        if (cost2 >= 1) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
