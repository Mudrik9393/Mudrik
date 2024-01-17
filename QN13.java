
/**
 * Write a description of class QN13 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class QN13
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter positive numbers: ");
        int number;
        
        while((number = input.nextInt()) > 0){
            sum += number;
        }
        
        System.out.println("sum of positive numbers: " +sum);
    }
}
