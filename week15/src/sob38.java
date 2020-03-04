
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class sob38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int[] arr = new int[120];
    for (int i = 0; i < 120; i++) arr[i] = (int)(Math.random() * 100);
    System.out.println("Completed generating random array of 120 integers");

    while (true) {
      try {
        System.out.println("\nEnter a index to get the number");
        int ind = s.nextInt();
        System.out.println(arr[ind]);
        break;
      } catch (InputMismatchException e) {
        System.out.println("Wrong input type; Try again!!!\n");
        s.next();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Number must be between 0-119; Try again!!!\n");
      }
    }    }
    
}
