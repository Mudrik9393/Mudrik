/**
 * Write a description of class QN11 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class QN11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("What is the speed of the vehicle in mph? ");
        int speed = scanner.nextInt();

        
        System.out.print("How many hours has it traveled? ");
        int hours = scanner.nextInt();

        
        System.out.println("\nHour\tDistance Traveled");

        
        for (int i = 1; i <= hours; i++) {
            int distance = speed * i;
            System.out.println(i + "\t\t" + distance);
        }

    
    }
}
