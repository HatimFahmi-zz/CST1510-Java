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
public class sob19 {
  public static int countletters(String str)
    {
      int count = 0;
      System.out.println("String: "+str);
      for (int i = 0; i < str.length(); i++) {
         if (Character.isLetter(str.charAt(i)))
            count++;
      }
      return count;
    }    
    public static void main(String[] args)
        {
          System.out.println("Enter your string: ");
          Scanner c = new Scanner(System.in);
          String s = c.nextLine();
          System.out.println("Number of Letters: "+countletters(s));

        }
    
  

}
