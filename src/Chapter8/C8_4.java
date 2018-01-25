package Chapter8;

import java.util.Scanner;

/**
 * Program to (print out the days and hours of the sales man, and to find total
 * hours worked)
 *
 * @author LouisTran
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0;
        int[] sum = {0, 0, 0, 0, 0, 0, 0};
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
        System.out.println("\t" + "\t" + "Su" + "\t" + "M" + "\t" + "T" + "\t" + "W" + "\t" + "Th" + "\t" + "F" + "\t" + "Sa" + "\t" + "Total");
        for (int x = 0; x < hours.length; x++) {
            System.out.print("Employee:" + x);
            for (int y = 0; y < hours[x].length; y++) {
                System.out.print("\t" + hours[x][y]);
                k += (hours[x][y]);
            }
            System.out.println("\t" + k);
            k = 0;
        }
        for (int x = 0; x < hours.length; x++) {
            for (int y = 0; y < hours[x].length; y++) {
                k += (hours[x][y]);
            }
        }
    }
}
