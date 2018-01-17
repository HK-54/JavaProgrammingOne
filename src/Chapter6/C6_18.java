package Chapter6;

import java.util.Scanner;

/**
 * Program to (password checker)
 *
 * @author Louis Tran
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in your passowrd");
        System.out.println("Must have");
        System.out.println("At least eight characters long");
        System.out.println("Only have numbers and letters");
        System.out.println("Have at least two numbers");
        String Userin = input.nextLine();
        charcheck(Userin);
    }

    public static String charcheck(String prime) {
        int passwordchar = prime.length();
        int Ppasswordchar = (passwordchar);
        if (Ppasswordchar >= 8) {
            lettercheck(prime);
        } else {
            System.out.println("Invalid input must have 8 charcters");
        }
        return null;
    }

    public static String lettercheck(String Userin) {
        if (Userin.matches("[a-zA-Z0-9]*")) {
            dublenumb(Userin);
        } else {
            System.out.println("Invalid input must only contain number and letters");
        }
        return null;
    }

    public static String dublenumb(String Userin) {
        if (Userin.matches(".*[0-9]. *[0-9]*")) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input must have to numbers");
        }
        return null;
    }
}
