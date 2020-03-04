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
public class ex2 {
    
    public static void main(String[] args) 
    {
        Scanner c = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = c.nextInt();
        
        if(n%5==0)
        {
            System.out.println("HiFive!");
        }
        else if (n%2==0)
        {
            System.out.println("HiEven!");
        }    
        else
            System.out.println("Number is neither HiFive or HiEven");

        }
    
}
