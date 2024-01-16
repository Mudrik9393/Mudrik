
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
public class Mapinduzi
{
   public String name;
   public int day;
   public String month;

public Mapinduzi(String name, int day, String month){
    this.name=name;
    this.day=day;
    this.month=month;
}

public int getDay(){
    return day;
}

public void avgDay(int interger){
    day+=interger;
}


}

   
   