/**
 * Write a description of class Room here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class QN1{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a 2-digit interger: ");
       int x = input.nextInt();
       int y = (x% 10) * (x/10);
       
       System.out.println("x: " + x);
       System.out.println("y: " + y);
       System.out.println("x + y: " + (x+y));
   }
}