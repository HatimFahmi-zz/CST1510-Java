/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

public class sob16 
{
    
    public static void main(String[] args) 
    
    {
      System.out.println("Celcius  |    Fahrenheit");
      for(int i=0; i<=100;i+=2)
          
      {
          double fahrenheit =((double)i*9/5+32.0);
       System.out.println(i + "\t | \t" + fahrenheit);
 
          
      }

    }

}