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
public class ex3 {
   
    public static void main(String[] args) 
    {
        Scanner c = new Scanner(System.in);
        
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*(num1+1));
    
        if(num1>=num2)
    {
        System.out.println("What is " + num1 + " - " + num2 + "?");
        int ans = c.nextInt();
        System.out.println((num1-num2==ans)?"Correct!":"Wrong!");
    }
    
    
    }
}
