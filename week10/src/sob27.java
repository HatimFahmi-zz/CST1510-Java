
import java.util.Date;

/**
 *
 * @author hatim
 */ 
public class sob27 {
    public static void main(String[] args) 
     {
        Account A1 = new Account(1122, 20000, .045);
        

        System.out.println("Date Created: " + A1.getdatecreated());
        System.out.println("Account ID: " + A1.getId());
        System.out.println("Balance: " + A1.getBalance());
        System.out.println("Interest Rate: " + A1.getAnnualInterestRate());
        System.out.println("Balance after withdraw of 2500: " + A1.withdraw(2500)); 
        System.out.println("Balance after deposit of 3000: " + A1.deposit(3000));
        System.out.println("Monthly Interest: " + A1.getMonthlyInterestRate()); 
    }
}