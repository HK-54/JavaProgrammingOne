package Chapter5;

import java.util.Scanner;

/**
 * Program to (play rock paper scissor)
 *
 * @author LouisTran
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
//rock papper or scissor
        System.out.println("Type in: 0 -scissor, 1- rock, or 2- papper");
        double Pscore = 0;
        double Cscore = 0;
        double nothing = 0;
//boolen
        do {
            double player = input.nextDouble();
            int computer = 0 + (int) Math.floor(Math.random() * ((2 - 0) + 1));
            if (computer == player) {
                System.out.println("Tie");
            } else if (computer == 0 && player == 2) {
                System.out.println("computer wins");
            } else if (computer == 2 && player == 0) {
                System.out.println("player wins");
            } else if (computer == 2 && player == 1) {
                System.out.println("computer wins");
            } else if (computer == 1 && player == 2) {
                System.out.println("player wins");
            } else if (computer == 1 && player == 0) {
                System.out.println("computer wins");
            } else if (computer == 0 && player == 1) {
                System.out.println("player wins");
            }
            if (computer == 2 && player == 0 || computer == 1 && player == 2 || computer == 0 && player
                    == 1) {
                ++Pscore;
            } else if (computer == 0 && player == 2 || computer == 2 && player == 1 || computer == 1
                    && player == 0) {
                ++Cscore;
            } else if (computer == player);
            ++nothing;
        } while (Pscore < 2 && Cscore < 2);
        if (Pscore == 2) {
            System.out.println("Vicorty");
        } else if (Cscore == 2) {
            System.out.println("Loss");
        }
    }
}
