package Chapter5;

import java.util.Scanner;

/**
 * Program to (count votes)
 *
 * @author LouisTran
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    //box standard formula
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
//varibles
        int TallyY = 0;
        int TallyN = 0;
        int Invalid = 0;
        String Voter;
//The hard thing
        do {
            System.out.println("To vote Yes type Y, to vote no type N, to end Voting type Q");
            Voter = input.next();
            if ("Y".equals(Voter) || "y".equals(Voter)) {
                ++TallyY;
            } else if ("N".equals(Voter) || "n".equals(Voter)) {
                ++TallyN;
            } else if ("Q".equals(Voter) || "q".equals(Voter)) {
                System.out.print("");
            } else {
                System.out.println("Invalid input");
                ++Invalid;
            }
        } while (!Voter.equals("Q") && !Voter.equals("q"));
        System.out.println("Yes votes " + TallyY);
        System.out.println("No Votes " + TallyN);
        System.out.println("Invalid votes " + Invalid);
        int totalvotes = (TallyY + TallyN + Invalid);
        System.out.println("Total votes " + totalvotes);
    }
}
