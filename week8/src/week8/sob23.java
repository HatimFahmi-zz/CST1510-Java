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
public class sob23 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter your numbers: ");
        
        for(int i=0; i<10 ; i++)
            arr[i]=input.nextInt();
        
        bubbleSort(arr);
        eliminateduplicates(arr);

    }
    
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    
    
    public static void eliminateduplicates(int list[])
    {
        int n = list.length;
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++)
        {  
            if (list[i] != list[i+1])
            {  
                temp[j++] = list[i];  
            }  
         }  
        temp[j++] = list[n-1];
        
            for (int i=0; i<j; i++){  
            list[i] = temp[i];  
        }  
            System.out.printf("array after removing duplicates: ");

        for (int i=0; i<j; i++)  
            System.out.printf(temp[i]+" ");
      
    }  
}
