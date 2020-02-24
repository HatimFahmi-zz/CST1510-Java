package ideas;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class leapyear
{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("Enter year: ");
    int year=in.nextInt();
    
    if(isleap(year))
        System.out.println(year + " is a leap year.");
    else
        System.out.println(year + " is not a leap year.");
    }
    
public static boolean isleap(int year)
{
    boolean leap = true;
    
    if(year % 4 == 0)
    {
        if( year % 100 == 0)
        {
                // year is divisible by 400, hence the year is a leap year
            if ( year % 400 == 0)
                leap = true;
            else
                leap = false;
        }
        else
            leap = true;
    }
    else
        leap = false;
    
    return leap;
}
}
