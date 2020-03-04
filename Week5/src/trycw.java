/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author hatim
 */
public class trycw {
    public static void main(String[] args)
    {
        int score=0;
        
        Scanner c =new Scanner(System.in);
        
         while(score != -1)
         { 
            System.out.println("Enter score (the input ends if it is -1):");
            score = c.nextInt();  
        
           System.out.println((score>=60)?"You pass the exam ":"You did not pass the exam");
break;
         }  

        
    }
    }        
