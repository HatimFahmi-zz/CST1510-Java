/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktest;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class q3 {
            public static void main(String[] args) 
        {
                String x[] = new String[3];       
                Scanner input = new Scanner(System.in);
        System.out.println("Main menu:- \n" 
                + "\n1.Conactenate words: "
                + "\n2.Count number of letters: "
                + "\n3.Remove a letter from a word: "
                + "\n4.Find a particular letter in a word: "
                + "\nEnter you choice: (1-4) ");
        int choice=input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        for(int i=1;i<4;i++)
                        { System.out.printf("\nPlease enter the word %d : ",i);
                        x[i-1] = input.nextLine();
                        }
                        if(!wordsequal(x[0],x[1]) && !wordsequal(x[0],x[2]) && !wordsequal(x[2],x[1]))
                            concatenate(x[0],x[1],x[2]);
                        else
                            System.out.println("Words are same!");
                        break;
                    case 2:
                        for(int i=1;i<4;i++)
                        { System.out.printf("\nPlease enter the word %d : ",i);;
                        x[i-1] = input.nextLine();
                        }
                        if(!wordsequal(x[0],x[1]) && !wordsequal(x[0],x[2]) && !wordsequal(x[2],x[1]))
                        {
                            countWordsLenght(x[0]);
                            countWordsLenght(x[1]);
                            countWordsLenght(x[2]);
                        }
                        else
                            System.out.println("Words are same!");
                        ;
                        break;
                    case 3:
                        {
                            for(int i=1;i<4;i++)
                            { System.out.printf("\nPlease enter the word %d : ",i);
                            x[i-1] = input.nextLine();
                            }   System.out.println("Please enter the letter to remove : ");
                            char c = input.next().charAt(0);
                            if(!wordsequal(x[0],x[1]) && !wordsequal(x[0],x[2]) && !wordsequal(x[2],x[1]))
                            {
                                removeLetter(x[0],c);
                                removeLetter(x[1],c);
                                removeLetter(x[2],c);
                            }
                            else
                                System.out.println("Words are same!");
                            break;
                        }
                    case 4:
                        {
                            for(int i=1;i<4;i++)
                            { System.out.printf("\nPlease enter the word %d : ",i);
                            x[i-1] = input.nextLine();
                            }   System.out.println("Please enter the letter to find : ");
                            char c = input.next().charAt(0);
                            if(!wordsequal(x[0],x[1]) && !wordsequal(x[0],x[2]) && !wordsequal(x[2],x[1]))
                            {
                                findIfStringContainsLetter(x[0],c);
                                findIfStringContainsLetter(x[1],c);
                                findIfStringContainsLetter(x[2],c);
                                
                            }
                            else
                                System.out.println("Words are same!");
                            break;
                        }
                    default:
                        System.out.println("Please enter a valid choice");
                        break;
                }
            }
        
        
  public static void concatenate(String x, String y, String z)
    {
        System.out.printf("\nResult of concatination of %s and %s and %s is %s \n",x,y,z,x+y+z);
    }
    
    public static void countWordsLenght(String x)
    {
        System.out.printf("\nThe lenght of " + x + " is " + x.length());
    }
    
    public static void removeLetter(String x, char c)
    {
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
    
    public static void findIfStringContainsLetter(String x, char c) 
    {
       
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
        System.out.printf("\n\nThe string " + x + " contains " + c);
    else
        System.out.printf("\n\nThe string " + x + " does not contain " + c);

    }
        public static boolean wordsequal(String x, String y)
        {
            return x.equals(y);
        }  

    
}
