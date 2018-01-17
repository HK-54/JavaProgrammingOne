package Chapter3;

import java.util.Scanner;

/**
 * Program to (Find if inputed number is divisible by 5 and 6)
 *
 * @author Tran i7
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your number-");
        //is it divisable by both
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + "Is divisable by 5 and 6? - True");
        } else {
            System.out.println(number + "Is divisable by 5 and 6? - False");
        }
        // is it divisable by one of them 
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + "is divisiable by 5 or 6? - True");
        } else {
            System.out.println(number + "is divisiable by 5 or 6? - False");
        }
        // can both be divisable
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number
                    + "is divisable by 5 or 6, but not both? - True");
        } else {
            System.out.println(number
                    + "is divisable by 5 or 6, but not both? - False");
        }
    }
}
