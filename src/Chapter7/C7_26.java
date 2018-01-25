package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to (To see if two inputed arrays are strictly identical)
 *
 * @author lt1002767
 */
public class C7_26 {
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main (String[]args) {
            Scanner input =new Scanner (System.in);
// array one
            System.out.println("Enter in how manny numbers are in your array");
               int y = input.nextInt();
//input array one
            System.out.println("Enter in your array");
                double [] listone = new double [y];
                for(int x=0; x < listone.length; x++) {
                        listone [x] = input.nextDouble();
                }
//array two
           System.out.println("Enter in how manny numbers are in you array");
               int z = input.nextInt();
//input array two
            System.out.println("Enter in your array");
                double [] listtwo = new double [z];
                for(int x=0; x < listtwo.length; x++) {
                        listtwo [x] = input.nextDouble();
                }
// are they the same?
                if (Arrays.equals(listone,listtwo))
                    System.out.println("strictly identical");
                else
                    System.out.println("not strictly identical");
        }
    }
