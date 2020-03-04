package week5;
import java.util.Scanner;

public class sob15 {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int num = s.nextInt();
        
        int score = 100000;
        String Name = "";
        
        int score2 = 100000;
        String Name2 = "";
        
        for (int i = 0; i < num; i ++)
        {
            System.out.println("Enter the students name: ");
            String name = s.next();
            System.out.println("Enter the students grade:");
            int grade = s.nextInt();
            
            if(grade<score && grade<score2) 
            {
                Name2 = Name;
                Name = name;
                score2 = score;
                score = grade;
            }
            else if(grade<score2)
            {
                score2=grade;
                Name2=name;
            }
        }
        
        System.out.println("The lowest score is: " + score + " by " + Name);
        System.out.println("The lowest score is: " + score2 + " by " + Name2);
    }
    
}