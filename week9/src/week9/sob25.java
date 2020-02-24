/*
return the samllest element in array
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class sob25 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        double [][]arr = new double[3][4];
        int smallind[] ;

         
        System.out.print( "Enter the elements: "); 
        for (int i = 0; i < 3; i++) 
        {    
            System.out.print( "\nrow " + i + " : \n" ); 

            for (int j = 0; j < 4; j++) 
                arr[i][j] = sc.nextDouble(); 
        }
        
        smallind = locatesmallest(arr);
        
        for(int i : smallind)
            System.out.print(i+" ");
    } 
   
    public static int[] locatesmallest(double[][] m)
    {
        double smallest = m[0][0];
        int smallind[] = new int[2];

        for (int row = 0; row < m.length; row++)
        {
            for (int col = 0; col < m[0].length; col++)
            {
                if (m[row][col] < smallest )
                {
                    smallest =  m[row][col];
                    smallind[0]=row;
                    smallind[1]=col;
                }    
            }    
        }
        return smallind;
    }
}