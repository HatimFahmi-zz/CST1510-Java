/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author hatim
 */
public class sob14 {
        
    public static void main(String[] args)
    {
        int score;
        
        Scanner c = new Scanner(System.in);
        
        System.out.println("Enter your score: ");
        score=c.nextInt();
        
        while(true)
        {
            if(score==-1)
            { System.out.println("No numbers entered expect 0");
            break;
            }
            else
            {System.out.println((score>=60)?"You pass the exam ":"You did not pass the exam");
            break;
            }
        }
    }
}
