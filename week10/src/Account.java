
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class Account {
    
        private int id;
        private double balance;
        private double annualIntrestRate;
        private Date datecreated;
        
        Account()
        {
            id = 0;
            balance =0.0;
            annualIntrestRate = 0.0;
            datecreated = new Date();

        }
        Account(int newid, double newbalance)
        {
            id = newid;
            balance = newbalance;            
        }
        Account(int newid, double newbalance, double newannualIntrestRate)
        {
            id = newid;
            balance = newbalance;
            annualIntrestRate = newannualIntrestRate;
        }
        
        public void getDateCreated( Date newDateCreated) 
        {
            datecreated = newDateCreated;
        }
        public int getId()
        {
            return id;
        }
        public double getBalance() 
        {
            return balance;
        }
        public double getAnnualInterestRate() 
        {
            return annualIntrestRate;
        }
        public void setId(int newId) 
        {
            id = newId;
        }
        public void setBalance( double newBalance) 
        {
            balance = newBalance;
        }
        public void setAnnualInterestRate( double newAnnualInterestRate) 
        {
            annualIntrestRate = newAnnualInterestRate;
        }
        double getMonthlyInterestRate() 
        {
            return annualIntrestRate/12;
        }
        double getMonthlyIntrest()
        {
            return (annualIntrestRate/12)*balance;
        }
        double withdraw(double amount) 
        {
            return balance -= amount;
        }   
        double deposit(double amount) 
        {
            return balance += amount;   
        }
        Date getdatecreated()
        {
            datecreated = new Date();
            return datecreated;
        }
}
