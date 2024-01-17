/**
 * Write a description of class QN8 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class QN8{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        for(int n =1; n<= 3; n++){
            System.out.println("Enter runner: " + n + "name: ");
            String name= input.nextLine();
            System.out.println("Enter time taken to finish: ");
            double time= input.nextDouble();
            System.out.println("Runner " + n + "" + name + "Time is: " + time );
        }
    }
}