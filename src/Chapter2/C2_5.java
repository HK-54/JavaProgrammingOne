package Chapter2;

import java.util.Scanner;

/**
 * Program to (Convert the subtotal and gratuity to their value)
 *
 * @author Tran i7
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gratuity rate-");
        double rate = input.nextDouble();
        double percent = rate / 100;
        System.out.print("Enter subtotal-");
        double subtotal = input.nextDouble();
        double graduity = subtotal * percent;
        double total = (graduity % 10) + 10;
        System.out.print("graduity rate is" + graduity
                + " /total is" + total);
    }
}
