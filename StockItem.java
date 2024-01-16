
/**
 * Write a description of class StockItem here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */
public class StockItem
{
    public int stocknumber;
    public String name;
    public double price;
    public int totalnumber;
    
    public StockItem(int stocknumber, String name, double price, int totalnumber){
        this.stocknumber=stocknumber;
        this.name=name;
        this.price=price;
        this.totalnumber=0;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public double getPrice(){
        return price;
    }
    
     public void setTotalnumber(int totalnumber){
        this.totalnumber=totalnumber;
    }
    
    public double getTotalnumber(){
        return totalnumber;
    }
     public void add(int number){
        totalnumber+=number;
    }
    
    public double calculatevalue(){
        return price*totalnumber;
    }
    
    public String toString(){
        return "The stocknumber is: " + stocknumber + "and name is" + name + "The price is: " + price+ " " +totalnumber;
    }
}

