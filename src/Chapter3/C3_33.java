package Chapter3;

import java.util.Scanner;

/**
 * Program to (Find the better price between two bags)
 *
 * @author Tran i7
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //The cost of the first rice
        System.out.print("Enter rice 1 Cost-");
        double rice1 = input.nextDouble();
        // The wieght of the first rice
        System.out.print("Enter rice 1 weight-");
        double weight1 = input.nextDouble();
        // The cost per pound for the rice1
        double cost1 = (rice1 / weight1);
        //The cost of the second rice
        System.out.print("Enter rice 2 Cost-");
        double rice2 = input.nextDouble();
        // The weight of the second rice
        System.out.print("Enter rice 2 weight-");
        double wight2 = input.nextDouble();
        //The cost per pound
        double cost2 = (rice2 / wight2);
        //better deal
        if (cost2 > cost1) {
            System.out.print("rice 2 is the better price");
        } else if (cost1 > cost2) {
            System.out.print("rice 1 is the better price");
        } else {
            System.out.print("equal price");
        }
    }
}
