/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this countlate file, choose Tools | Templates
 * and open the countlate in the editor.
 */
package week9;

import java.util.Random; 

/**
 *
 * @author hatim
 */
public class sob26 {
    public static void main(String[] args) 
    {
        Random rand = new Random(); 
        int [][]arr = new int[5][5];
         
        for (int i = 0; i < 5; i++) 
        {    
            for (int j = 0; j < 5; j++) 
            {
                arr[i][j] = rand.nextInt(2);
                System.out.print(" " + arr[i][j] ); 
            }
            System.out.println();
        }
        System.out.println("Row with the most 1's: " + scanRow(arr) + "\n");
        System.out.println("Columns with the most 1's: " + scanColumn(arr) + "\n");

    }
    public static int scanRow(int[][] array) 
    {
        int result = -1;
        int highest = -1;
        for (int row = 0; row < array.length; row++)
        {
            int count = 0;
            for (int col = 0; col < array[0].length; col++)// 
            {
                count = count + array[row][col];
            }

            if (count > highest)
            {
               highest = count;
               result = row + 1;
            }
        }
        System.out.println(highest);
        return result;
    } 
    public static int scanColumn(int[][] array)
    {
        int result = -1;
        int highest = -1;
        int colm=-1;
        for (int col = 0; col < array[0].length; col++)
        {
            int count = 0;
            for (int row = 0; row < array.length; row++) 
            {
                count = count + array[row][col];
            }
            colm++;
            if (count > highest) 
            {
                highest = count;
                result = colm+1;
            }
        }
        System.out.println(highest);
        return result;
    }
}
