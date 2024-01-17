/**
 * Write a description of class QN5 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class QN5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter years of citizenship: ");
        int yearsOfCitizenship = input.nextInt();

        boolean senateEligible = age >= 30 && yearsOfCitizenship >= 9;

        
        boolean houseEligible = age >= 25 && yearsOfCitizenship >= 7;

       
        System.out.println("\nEligibility Check:");
        System.out.println("Senate Eligibility: " + (senateEligible ? "Yes" : "No"));
        System.out.println("House Eligibility: " + (houseEligible ? "Yes" : "No"));

       
    }
}
