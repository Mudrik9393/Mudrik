
/**
 * Write a description of class QN9 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class QN9
{
   public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Quiz Score");
        int score = input.nextInt();
        if(score == 5){
            System.out.println("Grade: A");
        }else if(score == 4){
            System.out.println("Grade: B");
        }else if(score == 3){
            System.out.println("Grade: C");
        }else if(score == 2){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
        }
}
 

