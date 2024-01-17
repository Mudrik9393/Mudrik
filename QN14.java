/**
 * Write a description of class QN14 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class QN14
{
  public static void main(String[]args){
      Scanner input= new Scanner(System.in);
      
      System.out.println("Enter a value: ");
      int number = input.nextInt();
      for(number=1; number<=7; number++){
          System.out.println(number+ "\t" +(number*2)+ "\t" +(number*3)+ "\t" +(number*4)+"\t"+(number*5)+"\t"+(number*6)+"\t"+(number*7));
      }
      }
 }
  

