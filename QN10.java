public class QN10{
    public static void main(String[]args){
        int n=1;
        System.out.println("N\t10*N\tN*100\tN*1000");
        
        while(n<= 5){
            System.out.println(n + "\t" + n*100 + "\t" + n*100 + "\t" + n*1000);
            n++;
        }
    }
}