package Chapter6;

import java.util.Scanner;

/**
 * Program to (calculates the exchange of a U.S dollar)
 *
 * @author lt1002767
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //Prompting user
        System.out.println("How many Eros does a dollar buy?");
        double euroRate = input.nextDouble();
        System.out.println("How many Pround Sterling does a dollar buy? ");
        double poundRate = input.nextDouble();
        System.out.println("How many Yen does a dollar buy? ");
        double yenRate = input.nextDouble();

        String response = "";
        do {
            System.out.println("Please enter the number of dollars you want to convert");
            double dollars = input.nextDouble();
            //Choose which currency you want to convert
            System.out.println("Enter E to buy Euros, P to buy Pounds, or Y to buy Yen");
            String currency = input.next().toUpperCase();

            // Perform a conversion based on currency picked
            switch (currency.toUpperCase()) {
                case "E":
                    double euroBought = conversion(dollars, euroRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f euros", dollars, euroBought);
                    break;
                case "P":
                    double PoundBought = conversion(dollars, poundRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f pound", dollars, PoundBought);
                    break;
                case "Y":
                    double YenBought = conversion(dollars, yenRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen", dollars, YenBought);
                    break;
            }

            do {
                System.out.println();
                System.out.println("Are there more conversions: ");
                response = input.next();
            } while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"));

        } while (response.equalsIgnoreCase("yes"));
    }

    /**
     * Method to (find the exchange rate bones)
     *
     * @param dollar ( The user's inputed amount of dollars wanted converted)
     * @param currency ( the yen, eros, or pounds)
     * @return (The exchange rate bonus)
     */
    public static double conversion(double dollar, double currency) {
        if (dollar > 100) {
            return (dollar * 0.95 * currency);
        } else {
            return (dollar * 0.90 * currency);
        }
    }
}
