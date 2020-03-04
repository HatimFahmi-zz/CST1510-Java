/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/*
 *
 * @author hatim
 */
public class ex1  {
    
   
    public static void main(String[] args) 
    
    {
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        Scanner c = new Scanner (System.in);
        int count = 1;
        
        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int ans =c.nextInt();
        
        while(ans!=(num1+num2))
        {
        System.out.println("You are wrong!" + "\nTry again:");
        count++;
        
        ans =c.nextInt();
        }
        System.out.println("You are right! " + "\n You guessed it after " + count + " times");
    }
}
