package Chapter8;

import java.util.Scanner;

/**
 * Program to (Create chart to see salesman sales)
 *
 * @author LouisTran
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = "Y";
        String Id;
        String date;
        double[][] Salesman = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};
        do {
            do {
                System.out.println("Enter in Salesman ID as A, B, C, or D");
                Id = input.next().toUpperCase();
            } while (!Id.equals("A") && !Id.equals("B") && !Id.equals("C") && !Id.equals("D"));
            do {
                System.out.println("Enter in the day M, T, W, H ,or F");
                date = input.next().toUpperCase();
            } while (!date.equals("M") && !date.equals("T") && !date.equals("W") && !date.equals("H") && !date.equals("F"));
            System.out.println("Enter the amount of sales for sales man " + Id + " on " + date);
            if ("A".equals(Id)) {
                if ("M".equals(date)) {
                    Salesman[0][0] = input.nextDouble() + Salesman[0][0];
                }
            }
            if ("A".equals(Id)) {
                if ("T".equals(date)) {
                    Salesman[0][1] = input.nextDouble() + Salesman[0][1];
                }
            }
            if ("A".equals(Id)) {
                if ("W".equals(date)) {
                    Salesman[0][2] = input.nextDouble() + Salesman[0][2];
                }
            }
            if ("A".equals(Id)) {
                if ("H".equals(date)) {
                    Salesman[0][3] = input.nextDouble() + Salesman[0][3];
                }
            }
            if ("A".equals(Id)) {
                if ("F".equals(date)) {
                    Salesman[0][4] = input.nextDouble() + Salesman[0][4];
                }
            }
            if ("B".equals(Id)) {
                if ("M".equals(date)) {
                    Salesman[1][0] = input.nextDouble() + Salesman[1][0];
                }
            }
            if ("B".equals(Id)) {
                if ("T".equals(date)) {
                    Salesman[1][1] = input.nextDouble() + Salesman[1][1];
                }
            }
            if ("B".equals(Id)) {
                if ("W".equals(date)) {
                    Salesman[1][2] = input.nextDouble() + Salesman[1][2];
                }
            }
            if ("B".equals(Id)) {
                if ("H".equals(date)) {
                    Salesman[1][3] = input.nextDouble() + Salesman[1][3];
                }
            }
            if ("B".equals(Id)) {
                if ("F".equals(date)) {
                    Salesman[1][4] = input.nextDouble() + Salesman[1][4];
                }
            }
            if ("C".equals(Id)) {
                if ("M".equals(date)) {
                    Salesman[2][0] = input.nextDouble() + Salesman[2][0];
                }
            }
            if ("C".equals(Id)) {
                if ("T".equals(date)) {
                    Salesman[2][1] = input.nextDouble() + Salesman[2][1];
                }
            }
            if ("C".equals(Id)) {
                if ("W".equals(date)) {
                    Salesman[2][2] = input.nextDouble() + Salesman[2][2];
                }
            }
            if ("C".equals(Id)) {
                if ("H".equals(date)) {
                    Salesman[2][3] = input.nextDouble() + Salesman[2][3];
                }
            }
            if ("C".equals(Id)) {
                if ("F".equals(date)) {
                    Salesman[2][4] = input.nextDouble() + Salesman[2][4];
                }
            }
            if ("D".equals(Id)) {
                if ("M".equals(date)) {
                    Salesman[3][0] = input.nextDouble() + Salesman[3][0];
                }
            }
            if ("D".equals(Id)) {
                if ("T".equals(date)) {
                    Salesman[3][1] = input.nextDouble() + Salesman[3][1];
                }
            }
            if ("D".equals(Id)) {
                if ("W".equals(date)) {
                    Salesman[3][2] = input.nextDouble() + Salesman[3][2];
                }
            }
            if ("D".equals(Id)) {
                if ("H".equals(date)) {
                    Salesman[3][3] = input.nextDouble() + Salesman[3][3];
                }
            }
            if ("D".equals(Id)) {
                if ("F".equals(date)) {
                    Salesman[3][4] = input.nextDouble() + Salesman[3][4];
                }
            }
            do {
                System.out.println("Do you have more Y, N");
                in = input.next().toUpperCase();
            } while (!in.equals("N") && !in.equals("Y"));
        } while ("Y".equals(in));
        System.out.println("\t" + "\t" + "M" + "\t" + "T" + "\t" + "W" + "\t" + "H" + "\t" + "F" + "\t");
        for (int x = 0; x < Salesman.length; x++) {
            if (x == 0) {
                System.out.print("Salesman A");
            } else if (x == 1) {
                System.out.print("Salesman B");
            } else if (x == 2) {
                System.out.print("Salesman C");
            } else if (x == 3) {
                System.out.print("Salesman D");
            }
            for (int y = 0; y < Salesman[x].length; y++) {
                System.out.printf("\t" + "%.2f", Salesman[x][y]);
            }
            System.out.println("");
        }
    }
}
