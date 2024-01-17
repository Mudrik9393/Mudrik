
/**
 * Write a description of class QN15 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class QN15
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series f integers (-99 to end): ");
        int number = input.nextInt();
        int largest = number;
        int smallest = number;
        while(number != -99){
            if(number > largest){
                largest = number;
            }
            if(number < smallest){
                smallest = number;
            }
            number= input.nextInt();
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}    
    

