/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class ex4 {
   
    public static void main(String[] args) 
    {
    
     Scanner c = new Scanner(System.in);

     System.out.println("Enter your Age:");
     int age = c.nextInt();
   
     if(age>=16)
     { 
        System.out.println("Enter your Weight(kg):");
        int kg = c.nextInt();
    
        System.out.println("Enter your height(m):");
        double  m = c.nextDouble(); 
    
        double BMI = (kg/(Math.pow(m, 2.0))); 
        System.out.println(BMI);


        if(BMI>=30.0)
            System.out.println("Obese!");
         
        else if (BMI>=25.0 && BMI<30.0)
            System.out.println("Overweight!");
         
        else if (BMI>=18.5 && BMI<25.0)
            System.out.println("Normal!");
         
        else if (BMI<18.5)
            System.out.println("Underweight");
         
         
     }
     else 
        System.out.println("Age is under 16");
    }
}