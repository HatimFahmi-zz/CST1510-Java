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
public class TASK {
    
        public static void main(String[] args) {

    String wel ="Welcome to java!";
    System.out.println(wel + " " + "\nEnter first name: ");
    
    Scanner input = new Scanner (System.in);
    String fname;
    fname = input.next();
    
    System.out.println("\n Welcome " + fname +"\n Enter age:");
   int  age = input.nextInt();
    
    System.out.println("\nEnter Gender: ");
    char gender = input.next().charAt(0);
   System.out.println("\n AGE:" + age + "\n Gender:" + gender); 
}

}