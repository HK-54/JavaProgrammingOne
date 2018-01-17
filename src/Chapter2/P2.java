package Chapter2;

import java.util.Scanner;

/**
 * Program to (Find the price a dinner with tax)
 *
 * @author Tran i7
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of meal-");
        double meal = input.nextDouble();
        System.out.print("Enter price of drink-");
        double drink = input.nextDouble();
        System.out.print("Enter price of dessert-");
        double dessert = input.nextDouble();
        double dinner = meal + drink + dessert;
        double tax = dinner * .10;
        double tip = (dinner + tax) * .15;
        double totalcost = dinner + tax + tip;
        System.out.print("Dinner is-" + dinner
                + "/ Tax is-" + tax
                + "/ Tip is-" + tip
                + "/ Totalcost is-" + totalcost);
    }
}
