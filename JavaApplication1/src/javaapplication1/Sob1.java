/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Sob1 {
    
     public static void main(String[] args) {
         
         
    Scanner c = new Scanner (System.in);

         
   char c1 ,c2 , c3, c4, c5;
    System.out.println("Enter 5 characters: "
            + "\n 1st charcater:");
    c1 = c.next().charAt(0);
    
    System.out.println("2nd character:");
    c2 = c.next().charAt(0);
         
    System.out.println("3nd character:");
    c3 = c.next().charAt(0);     
         
    System.out.println("4th character:");
    c4 = c.next().charAt(0);    
         
    System.out.println("5th character:");
    c5 = c.next().charAt(0);     
         
    System.out.println("\nConcatenate:"
            + "" + c1+c2+c3+c4+c5);
        
     }
     
}
