package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program to (find the better bidder who will spend the less money)
 *
 * @author Tran i7
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
//bidder one
        System.out.println("Name of Bidder one-");
        String Bidderone = input.next();
        System.out.println("Estmated time of completion-");
        int Ohourone = input.nextInt();
        System.out.println("Hourly charge-");
        double Hpayone = input.nextDouble();
//bidder two
        System.out.println("Name of Bidder two-");
        String Biddertwo = input.next();
        System.out.println("Estmated time of completion-");
        int Ohourtwo = input.nextInt();
        System.out.println("Hourly charge-");
        double Hpaytwo = input.nextDouble();
//bidder one rate of pay with time
        double Onerate = (Ohourone * Hpayone);
//bidder two rate of pay with time
        double Tworate = (Ohourtwo * Hpaytwo);
//rounding 
        String roundonerate = decimal.format(Onerate);
        String roundtworate = decimal.format(Tworate);
//bidder one victory
        if (Onerate < Tworate) {
            System.out.println("Winner is " + Bidderone);
            System.out.println("Total cost is " + roundonerate);
            if (Ohourone < Ohourtwo) {
                System.out.println("The number of hour is " + Ohourone);
            }
        }
// Bidder two victory 
        if (Onerate > Tworate) {
            System.out.println("Winner is " + Biddertwo);
            System.out.println("Total cost is " + roundtworate);
            if (Ohourtwo > Ohourone) {
                System.out.println("The number of hour is " + Ohourtwo);
            }
        }
        if (Onerate == Tworate && Ohourone < Ohourtwo) {
            System.out.println("Winner is " + Bidderone);
            System.out.println("Total cost is " + roundonerate);
            System.out.println("The number of hour is " + Ohourone);
        }
        if (Onerate == Tworate && Ohourone > Ohourtwo) {
            System.out.println("Winner is " + Biddertwo);
            System.out.println("Total cost is " + roundtworate);
            System.out.println("The number of hour is " + Ohourtwo);
        } //Tied
        else if (Onerate == Tworate && Ohourone == Ohourtwo) {
            System.out.println("Both " + Bidderone + " and " + Biddertwo + " are tied");
            System.out.println("Number of hour");
            System.out.println("First bidder " + Ohourone + " Second bidder " + Ohourtwo);
            System.out.println("Cost per hour");
            System.out.println("First bidder " + Hpayone + " Second bidder " + Hpaytwo);
            System.out.println("Tottal cost");
            System.out.println("First bidder " + roundonerate + " Second bidder " + roundtworate);
        }
    }
}
