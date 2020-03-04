
import java.util.Scanner;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class sob35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter your elements(0 to end):");
        while(true)
        {
            int num = s.nextInt();
            if (num == 0) 
                break;
            else
                list.add(num);
        }

    System.out.println("Minimum: " + min(list));
    
    }
    public static Integer min(ArrayList<Integer> list)
    {
        if (list == null || list.size() == 0) 
        {
            return null;
        } 
        else 
        {
            Integer min = list.get(0);
            for (Integer num : list) 
            {
                if (num < min) min = num;
            }
            return min;
        }
    } 
}
