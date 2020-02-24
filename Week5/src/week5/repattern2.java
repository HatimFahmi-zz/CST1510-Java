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
public class repattern2 {
        
    public static void main(String[] args)
    {
        int num;
        
        Scanner c = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        num=c.nextInt();
        
      for (int i=0; i<num ; i++)    
      {
        System.out.println("***");
      }
    }
}
