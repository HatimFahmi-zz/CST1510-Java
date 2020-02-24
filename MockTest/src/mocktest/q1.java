package mocktest;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        String x = input.nextLine();
        System.out.println("Please enter the second word: ");
        String y = input.nextLine();
        System.out.println("Please enter the letter to remove : ");
        char c = input.next().charAt(0);

        concatenate(x,y);
        countWordsLength(x,y);
        removeLetter(x,c);
        findIfStringContainsLetter(x,c);
    }
    
        public static void concatenate(String x, String y)
    {
        String z = x+y;
        System.out.printf("\nResult of concatination of %s and %s is %s \n",x,y,z);
    }
    
    public static void countWordsLength(String x, String y)
    {
        System.out.printf("\nThe lenght of " + x + " is " + x.length());
        System.out.printf("\nThe lenght of " + y + " is " + y.length());
    }
    
    public static void removeLetter(String x, char c){
        String z = "";
        for (int i=0;i<=x.length()-1;i++)
        {
            if(x.charAt(i)==c)
            continue;
            else 
                z = z + x.charAt(i);
        }
         System.out.printf("\n\nThe new string is " + z + " after removing " + c);

    }
    
    public static void findIfStringContainsLetter(String x, char c) {
       
        boolean y = true;
        
        for (int i=0;i<=x.length()-1;i++)
        {
            if(x.charAt(i)==c)
            { y=true;
            break;
            }
            else 
                y=false;
        }
    if(y==true)
        System.out.printf("\n\nThe string " + x + " contains " + c);
    else
        System.out.printf("\n\nThe string " + x + " does not contain " + c);

    }
}
