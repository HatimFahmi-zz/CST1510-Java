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
public class examples {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double grade[] = new double[100];
        String fname[] = new String[100];
        char gender[] = new char[100];
        boolean result[] = new boolean[100];
        for(int i=0;i<100;i++)
        {       fname[i]=input.next();
                                grade[i]=input.nextDouble();
                        gender[i]=input.next().charAt(0);

        }

     }
}
