package Chapter4;

import java.util.Scanner;

/**
 * Program to (Input two strings and see if their any same strings)
 *
 * @author Tran i7
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//String 1
        System.out.print("Enter in String 1");
        String one = input.next();
//String 2
        System.out.print("Enter in String 2");
        String two = input.next();
//comparing the two Stings
        if (one.contains(two)) {
            System.out.print(two + " is a substring " + one + " ");
        } else {
            System.out.print(two + " is not a substring " + one + " ");
        }
    }
}
