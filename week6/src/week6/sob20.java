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
public class sob20 {
  

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print(
                "1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least three digits \n" +
                "\nInput a password : ");
        String s = input.nextLine();

        if (is_Valid_Password(s))
        {
            System.out.println("Password is valid: " + s);
        } 
        else
        {
            System.out.println("Not a valid password: " + s);
            
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < 10)
            return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++)
        {

            char ch = password.charAt(i);

            if (Character.isDigit(ch)) 
                numCount++;
            else if (Character.isAlphabetic(ch)) 
                charCount++;
            else
                charCount++;
        }


        return (charCount >= 2 && numCount >= 3);
    }


}
             
             
         
    

