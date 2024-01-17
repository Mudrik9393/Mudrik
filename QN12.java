/**
 * Write a description of class QN12 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class QN12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numYears = scanner.nextInt();
        double totalRainfall = 0;
        int totalMonths = 0;

    
        for (int year = 1; year <= numYears; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter inches of rainfall for Year " + year + ", Month " + month + ": ");
                double inches = scanner.nextDouble();
                totalRainfall += inches;
                totalMonths++;
            }
        }

        
        double averageRainfall = totalRainfall / totalMonths;

        
        System.out.println("\nResults:");
        System.out.println("Number of months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.println("Average rainfall per month: " + averageRainfall + " inches");

    
        
    }
}
