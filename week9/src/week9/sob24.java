/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class sob24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner (System.in);
        double [][]arr = new double[3][4]; 
 
            System.out.print( "Enter the elements: "); 
        for (int i = 0; i < 3; i++) 
        {    
            System.out.print( "\nrow " + i + " : \n" ); 

            for (int j = 0; j < 4; j++) 
                arr[i][j] = sc.nextDouble(); 
        }
        for (int i = 0; i < 3; i++)
                System.out.println( "Sum of the row " + (i+1) + " = " + sumRow(arr,i));         
    }
    public static double sumRow(double[][] m, int rowindex)
    {
        double sum = 0.0;
        for (int i = 0; i < m[0].length; i++) {
            sum += m[rowindex][i];
        }
        return sum;
    }
}
