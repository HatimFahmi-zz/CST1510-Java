 
package week5;
import java.util.Scanner;

public class revpattern 
{ 
public static void main(String args[]) 
   { 
    int n ; 
    Scanner c =new Scanner(System.in);
    System.out.println("Enter no. for xmas :");
    n = c.nextInt();  
    int i, j; 
   
    for(i=0; i<n; i++) 
    {
        for (j=n-i; j>1; j--)
        { 
            System.out.print(" "); 
	} 
        for (j=0; j<=i; j++ ) 
	{ 
            System.out.print(" *"); 
	}
        System.out.println(); 
    }  
    }
}  