/**
 * Write a description of class QN4 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class QN4 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        
        final double ASSESSMENT_RATE = 0.60;
        final double TAX_RATE_PER_100 = 2.64;

     
        System.out.print("Enter the actual value of the property: $");
        double actualValue = input.nextDouble();

        double assessedValue = actualValue * ASSESSMENT_RATE;

        double annualTax = (assessedValue / 100) * TAX_RATE_PER_100;

       
        System.out.println("\nProperty Details:");
        System.out.println("Actual Value: $" + actualValue);
        System.out.println("Assessed Value: $" + assessedValue);
        System.out.println("Annual Property Tax: $" + annualTax);

    }
}
