/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class rev {
    public static double power(int a )
    {
       
       return (Math.pow(a, 3)) ;
    }
        
      public static void main(String[] args) {
          Scanner n = new Scanner (System.in);
      System.out.printf("Enter  numbers: ");
      int n1=n.nextInt();
      //int n2=n.nextInt();
     System.out.println( "power is "+power (n1));
      
      
      }  
    
}
