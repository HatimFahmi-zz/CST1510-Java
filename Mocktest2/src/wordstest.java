
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
public class wordstest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        words trial= new words();
        Scanner input = new Scanner(System.in);
        int num;
        String arr[] = new String[20]; 
        System.out.println("Enter number of words: ");
        num = input.nextInt();
        for(int i=0 ;i<num ;i++)
        {
            System.out.println("Enter your word " + (i+1) +": ");
            arr[i] = input.next(); 
        }
        trial.disp(arr,"fsa");
        
        
    }
    
}
