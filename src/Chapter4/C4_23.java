package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program to (Build a profile of an employee for their sallery)
 *
 * @author Tran i7
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
//Enter in name
        System.out.println("Enter in employee's name");
        String Employee = input.next();
//Enter in Hours worked
        System.out.println("Enter in emplyee's hours");
        double Time = input.nextDouble();
//Enter in Pay rate
        System.out.println("Enter in pay per hour");
        double pHour = input.nextDouble();
//Federal tax
        System.out.println("Enter in the Federial tax");
        double Ftax = input.nextDouble();
//State tax
        System.out.println("Enter in the State tax");
        double Stax = input.nextDouble();
//calculated hours with pay rate
        double Hperpay = (Time * pHour);
//calculated Hour per pay rate by federal tax
        double FHperpay = (Ftax * Hperpay);
// calculated Hour per pay rate by State tax
        double SHperpay = (Stax * Hperpay);
//add the tax together
        double alltax = (FHperpay + SHperpay);
//The pay
        double netpay = (Hperpay - alltax);
//rounding
        String roundtax = decimal.format(alltax);
        String roundnetpay = decimal.format(netpay);
        String roundShperpay = decimal.format(SHperpay);
        String roundFhperpay = decimal.format(FHperpay);
        String roundHperpay = decimal.format(Hperpay);
        String roundpHour = decimal.format(pHour);
        String roundtime = decimal.format(Time);

//output
        System.out.println("Emplyee name is " + Employee);
        System.out.println("Hours worked is " + roundtime);
        System.out.println("Pay rate " + roundpHour);
        System.out.println("Gross pay " + roundHperpay);
        System.out.println("Sallery after Federial tax " + roundFhperpay);
        System.out.println("Sallery after State tax " + roundShperpay);
        System.out.println("Tax total of the taxs are " + roundtax);
        System.out.println("Net pay is " + roundnetpay);
    }
}
