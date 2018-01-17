package Chapter4;

import java.util.Scanner;

/**
 * Program to ( Enter in your major and year)
 *
 * @author Tran i7
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// what class are you in
        System.out.println("Enter Major and status");
        System.out.println("M = Mathematics");
        System.out.println("C = ComputerScience");
        System.out.println("I = informationTechonology");
        System.out.println("1 = Freshman");
        System.out.println("2 = Sophomore");
        System.out.println("3 = Junior");
        System.out.println("4 = Senior");
        String g = input.next();
        char x = g.charAt(0);
        char y = g.charAt(1);
        if (x == 'M' && y == '1') {
            System.out.print(" Mathmatics Freshman");
        } else if (x == 'M' && y == '2') {
            System.out.print(" Mathmatics Sophmore");
        } else if (x == 'M' && y == '3') {
            System.out.print(" Mathmatics Junior");
        } else if (x == 'M' && y == '4') {
            System.out.print(" Mathmatics Senior");
        } else if (x == 'C' && y == '1') {
            System.out.print(" ComputerScience Freshman");
        } else if (x == 'C' && y == '2') {
            System.out.print(" ComputerScience Sophmore");
        } else if (x == 'C' && y == '3') {
            System.out.print(" ComputerScience Junior");
        } else if (x == 'C' && y == '4') {
            System.out.print(" ComputerScience Senior");
        } else if (x == 'I' && y == '1') {
            System.out.print(" InformationTechonology Freshman");
        } else if (x == 'I' && y == '2') {
            System.out.print(" InformationTechonology Sophmore");
        } else if (x == 'I' && y == '3') {
            System.out.print(" InformationTechonology Junior");
        } else if (x == 'I' && y == '4') {
            System.out.print(" InformationTechonology Senior");
        } else {
            System.out.println("Invalid input");
        }
    }
}
