package Chapter5;

import java.util.Scanner;

/**
 * Program to (reverse the inputed string)
 *
 * @author LouisTran
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
//prompt
        System.out.println("Enter in your phrase");
        String phrase = input.next();
//This is were all the magic happens
        for (int prime = phrase.length(); prime > 0; prime--) {
            char x = phrase.charAt(prime - 1);
            System.out.print(x);
        }
    }
}
