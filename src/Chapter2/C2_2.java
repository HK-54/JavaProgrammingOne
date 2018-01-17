package Chapter2;

import java.util.Scanner;

/**
 * Program to (Solve area and volume for a cylinder)
 *
 * @author Tran i7
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius-");
        double PI = 3.14159;
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.print("Enter length-");
        double length = input.nextDouble();
        double volume = area * length;
        System.out.print("area is-" + area
                + " /volume is-" + volume);
    }
}
