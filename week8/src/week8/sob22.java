/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class sob22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double arr[] = new double[10];
        System.out.println("Enter your numbers: ");
        
        for(int i=0; i<10 ; i++)
            arr[i]=input.nextDouble();
        
        System.out.println("Index of largest number: " + indexofLargestElement(arr));

    }
     public static int indexofLargestElement(double[] arr) {
        double max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index+1;
    }
  
}
