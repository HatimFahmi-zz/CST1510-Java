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
public class sob21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double arr[] = new double[10];
        System.out.println("Enter your numbers: ");
        
        for(int i=0; i<10 ; i++)
            arr[i]=input.nextDouble();
        
        System.out.println("sum: " + sum(arr));

    }
     public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    
    public static double sum(double[] arr) {
        double sum = 0;
        for (double i : arr) sum += i;
        return sum;
    }
}
