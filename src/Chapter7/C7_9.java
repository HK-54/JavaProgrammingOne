package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to
 *
 * @author lt1002767
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter in ten numbers");
        double[] array = new double[10];
//user entering the array
        for (int x = 0; x < array.length; x++) {
            Scanner input = new Scanner(System.in);
            array[x] = input.nextDouble();
        }
        double prime = min(array);
        System.out.println("The min of the array is " + prime);
//finding the smallest array
    }
    /**
     * Program to (find the min of the array)
     *
     * @param array finds the min of the array
     * @return (the min of the arrays)
     */
    public static double min(double[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
