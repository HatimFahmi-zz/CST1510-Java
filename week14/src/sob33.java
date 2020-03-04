
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class sob33 {
public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a 5 numbers:");

    for (int i = 0; i < 5; i++)
    {
      list.add(s.nextInt());
    }
    
    sort(list);
    System.out.println("The sorted list:");
    for (int num : list) 
        System.out.println(num);
  }

    public static ArrayList<Integer> sort(ArrayList<Integer> list) {         

    Collections.sort(list, Collections.reverseOrder());         

    return list;     

  } 
}
