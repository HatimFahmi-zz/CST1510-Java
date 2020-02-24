
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Hatim
 */
public class Sob2 {
         public static void main(String[] args) {
         
          Scanner c = new Scanner (System.in);  //scanner identifier

         
   String s1 ,s2 , s3; //creating string variables
   
    System.out.println("Enter 3 strings: "
            + "\n 1st string:");  
    s1 = c.next(); // enter value of s1 by user
    
    System.out.println("2nd string:");
    s2 = c.next();  // enter value of s2 by user
         
    System.out.println("3nd string:");
    s3 = c.next();  // enter value of s3 by user
         
    System.out.println("\nConcatenate:"
            + " " + s1 + " " +s2 + " " + s3);
             
         
         }
}
