import java.util.Scanner;

/**
 *
 * name: hatim fahmi
 * Student id :M00735091
 * Date :18/11/19
 */
public class Statistics {
    
    public static void main(String[] args)
    {
        int num1 , num2 , num3 , ch;
        Scanner in= new Scanner (System.in);
        do
        {
            System.out.println("\n1. Sum of three numbers: ");
            System.out.println("2. Max of three numbers: ");
            System.out.println("3. Min of three numbers:"
                    + "\n4. Range of numbers:"
                    + "\n-1 to exit "
                    + "\nEnter your choice :");
            ch=in.nextInt();
            
            switch(ch)
            {
                case 1:
                    System.out.println("\nEnter three numbers: ");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    num3 = in.nextInt();

        
                    System.out.println("Enter min of " + num1 + " and " + num2 + " and " + num3 + " is " +sum(num1,num2,num3));
                    break;
                
                case 2:
                    System.out.println("\nEnter three numbers: ");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    num3 = in.nextInt();

        
                    System.out.println("Enter max of " + num1 + " and " + num2 + " and " + num3 + " is " + max(num1,num2,num3));
                    break;
                
                case 3:
                    System.out.println("\nEnter three numbers: ");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    num3 = in.nextInt();
        
                    System.out.println("Enter min of " + num1 + " and " + num2 + " and " + num3 + " is " +min(num1,num2,num3));
                    break;
                
                case 4:
                    System.out.println("\nEnter three numbers: ");
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    num3 = in.nextInt();
        
                    System.out.println("Enter range of " + num1 + " and " + num2 + " and " + num3 + " is " + range(num1,num2,num3));
                    break;
                    
                case -1:
                    break;
                default:
                    System.out.println("\nWrong choice!");
                    break;    
            }
          
        }while(ch!=-1);
    
    }
    public static int sum(int num1, int num2 , int num3)
    {
        return (num1+num2+num3);
    }
    public static int max(int num1 , int num2 , int num3)
    {
        int MAX = 0;
        if(num1>num2)
            MAX = num1;
        else if(num1<num2)
            MAX = num2;
        if(MAX>num3)
            ;
        else if(MAX<num3)
            MAX=num3;
        
        return MAX;
    }
    public static int min(int num1 , int num2 , int num3)
    {
        int MIN = 0;
        if(num1<num2)
            MIN = num1;
        else if(num1>num2)
            MIN = num2;
         if(MIN<num3)
            ;
        else if(MIN>num3)
            MIN = num3;
         
        return MIN;
        
    }
    public static int range(int num1 , int num2,int num3)
    {
        int MAX = max(num1,num2,num3);
        int MIN = min(num1,num2,num3);
        return(MAX - MIN);
    }

}


