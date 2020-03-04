/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktest;
import java.util.Scanner;

/**
 * 
 * 
 *
 * @author hatim
 */
public class q2 {
        public static void main(String[] args) 
        {
             Scanner input = new Scanner(System.in);
        System.out.println("Main menu:- \n"
                + "\n1.Conactenate words: "
                + "\n2.Count number of letters: "
                + "\n3.Remove a letter from a words: "
                + "\n4.Find a particular letter in a words: "
                + "\nEnter you choice: (1-4) ");
        int choice=input.nextInt();
        input.nextLine();
        
            switch (choice) 
            {
                case 1:
                    {
                        System.out.println("Please enter the first word: ");
                        String x = input.nextLine();
                        System.out.println("Please enter the second word: ");
                        String y = input.nextLine();
                        String z = x+y;
                        System.out.printf("\nResult of concatination of %s and %s is %s \n",x,y,z);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Please enter the first word: ");
                        String x = input.nextLine();
                        System.out.println("Please enter the second word: ");
                        String y = input.nextLine();
                        System.out.printf("\nThe lenght of " + x + " is " + x.length());
                        System.out.printf("\nThe lenght of " + y + " is " + y.length());
                        break;
                    }
                case 3:
                    {
                        System.out.println("Please enter the first word: ");
                        String x = input.nextLine();
                        System.out.println("Please enter the second word: ");
                        String y = input.nextLine();
                        System.out.println("Please enter the letter to remove : ");
                        char c = input.next().charAt(0);
                        String z = "";
                        String u = "";
                        for (int i=0;i<=x.length()-1;i++)
                        {
                            if(x.charAt(i)==c)
                                continue;
                            else
                                z = z + x.charAt(i);
                        }
                        System.out.printf("\nThe new string is " + z + " after removing " + c);
           
                        for (int i=0;i<=y.length()-1;i++)
                        {
                            if(y.charAt(i)==c)
                                continue;
                            else 
                                z = z + y.charAt(i);
                        }
                        System.out.printf("\nThe new string is " + u + " after removing " + c);
                        break;
                    }
                case 4:
                    {
                        System.out.println("Please enter the word: ");
                        String x = input.nextLine();
                        System.out.println("Please enter the letter to remove : ");
                        char c = input.next().charAt(0);
                        boolean y = true;
                        for (int i=0;i<=x.length()-1;i++)
                        {
                            if(x.charAt(i)==c)
                            {
                                y=true;
                                break;
                            }
                            else
                                y=false;
                        }
                        if(y==true)
                            System.out.printf("\nThe string " + x + " contains " + c);
                        else
                            System.out.printf("\nThe string " + x + " does not contain " + c);
                        break;
                    }
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }
        
  public static void concatenate(String x, String y)
    {
        String z = x+y;
        System.out.printf("\nResult of concatination of %s and %s is %s \n",x,y,z);
    }
    
    public static void countWordsLenght(String x,String y)
    {
        System.out.printf("\nThe lenght of " + x + " is " + x.length());
        System.out.printf("\nThe lenght of " + y + " is " + y.length());

    }
    
    public static void removeLetter(String x,String y, char c)
    {
        String z = "";
        String u = "";

        for (int i=0;i<=x.length()-1;i++)
        {
            if(x.charAt(i)==c)
            continue;
            else 
                z = z + x.charAt(i);
        }
         System.out.printf("\nThe new string is " + z + " after removing " + c);
           
         for (int i=0;i<=y.length()-1;i++)
        {
            if(y.charAt(i)==c)
            continue;
            else 
                z = z + y.charAt(i);
        }
         System.out.printf("\nThe new string is " + u + " after removing " + c);

    }
    
    public static void findIfStringContainsLetter(String x, char c) 
    {
       
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
        System.out.printf("\nThe string " + x + " contains " + c);
    else
        System.out.printf("\nThe string " + x + " does not contain " + c);

    }
}

