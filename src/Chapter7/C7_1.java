package Chapter7;

import java.util.Scanner;

/**
 * Program to (Uses the highest inputed grade to give the others a grade) 
 *
 * @author lt1002767
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in number of students");
        int BR78 = input.nextInt();
        double[] userin = new double[BR78];
        System.out.println("Enter in your sores");
//inputing in for the array
        for (int prime = 0; prime < userin.length; prime++) {
            userin[prime] = input.nextDouble();
        }
//findin the max
        double max = userin[0];
        for (int i = 0; i < userin.length; i++) {
            if (max < userin[i]) {
                max = userin[i];
            }
        }
//finding the things for that other thing
        double PrimmA = (max - 10);
        double PrimmB = (max - 20);
        double PrimmC = (max - 30);
        double PrimmD = (max - 40);
//output for the array
        for (int y = 0; y < userin.length; y++) {
            if (userin[y] >= PrimmA) {
                System.out.println("Student " + y + " Score " + userin[y] + " is an A ");
            } else if (userin[y] >= PrimmB && userin[y] < PrimmA) {
                System.out.println("Student " + y + " Score " + userin[y] + " is an B");
            } else if (userin[y] >= PrimmC && userin[y] < PrimmB) {
                System.out.println("Student " + y + " Score " + userin[y] + " is an C");
            } else if (userin[y] >= PrimmD && userin[y] < PrimmC) {
                System.out.println("Student " + y + " Score " + userin[y] + " is an D");
            } else {
                System.out.println("Student " + y + " Score " + userin[y] + " is an F");
            }
        }
    }
}
