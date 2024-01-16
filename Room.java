
/**
 * Write a description of class Room here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
public class Room
{
   private double width;
   private int length;
   private int floor;

public Room(double width,double length,int floor){
    width = width;
    length = length;
    floor = floor;
}


public static void setWidth(double width){
    width = width;
    }


public double geWidth(){
    return width;
}

public static void setLength(int length){
    length = length;
    }

public int getLength(){
    return length;
}

public static void setFloor(int floor){
    floor=floor;
}

public int getFloor(){
    return floor;
}

public String toString(){
    return "length*width, floor 1";
}

}
