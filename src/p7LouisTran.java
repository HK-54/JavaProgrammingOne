import java.util.Scanner;
import java.util.Arrays;
    public class p7LouisTran {
        public static void main(String[]args) {
            Scanner input =new Scanner (System.in);
            System.out.println("How manny numbers will your array have");
            System.out.println('1' + 1 + 1);
                int userin = input.nextInt();
                double [] Prime = new double [userin];
                System.out.print("Enter in " + userin + " array ");
                Arrayin(Prime);
                double acutall = avrage(Prime);
                System.out.println("The avrage is " + acutall);
                System.out.println("The content of the array is " + Arrays.toString(Prime));
        }
    public static void Arrayin (double [] Prime) {
        Scanner input =new Scanner (System.in);
            for(int x = 0; x < Prime.length; x++) {
                Prime [x] = input.nextDouble();
        }
    }
    public static double avrage (double [] Prime) {
        double y = 0;
        for (int x = 0; x < Prime.length; x ++) {
            y = y + Prime[x];
        }
        return y/Prime.length;
    }
    }

