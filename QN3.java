

/**
 * Write a description of class QN3 here.
 *
 * @author (Mudrik, BITA/6/22/046/TZ)
 * @version (a version number or a date)
 */



public class QN3 {
    public static void main(String[] args) {
        
        double annualSalary = 32500.0;

        
        int payPeriodsBiMonthly = 24;
        int payPeriodsBiWeekly = 26; 

       
        double grossPayBiMonthly = annualSalary / payPeriodsBiMonthly;
        double grossPayBiWeekly = annualSalary / payPeriodsBiWeekly;

        System.out.println("Employee's Annual Salary: $" + annualSalary);
        System.out.println("Gross Pay for Each Pay Period (Bi-Monthly): $" + grossPayBiMonthly);
        System.out.println("Gross Pay for Each Pay Period (Bi-Weekly): $" + grossPayBiWeekly);
    }
}
