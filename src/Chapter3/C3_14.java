package Chapter3;

import java.util.Scanner;

/**
 * Program to (Guss the coin flip)
 *
 * @author Tran i7
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param arges arguments from command line prompt
     */
    public static void main(String arges[]) {
        Scanner input = new Scanner(System.in);
        //Heads should be 0 and Tails should be 1
        System.out.print("Heads: 0 Tails: 1 -");
        //Random number between 0 and 1 to determine the flip of the coin
        int coin = input.nextInt();
        //floor both heads and tails ceil oly heads
        int flip = (int) Math.floor(Math.random() * 2);
        //if true
        //System.out.println (variable1+"");
        if (coin == flip) {
            System.out.print("correct");
        } else {
            System.out.print("inncorrect");
        }
    }
}
