/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class MyInteger 
{
    private int mvalue;
    
    MyInteger(int value)
    {
        this.mvalue = value;
    }
    public int getValue()
    {
        return mvalue;
    }
    public boolean isEven()
    {
        return (mvalue % 2)==0;
    }
    public boolean isOdd()
    {
        return (mvalue % 2)==1;
    }
    public boolean isPrime()
    {
        if(mvalue == 1 || mvalue == 2)
        {
            return true;
        }
        else
        {
            for(int i = 2 ; i<mvalue ; i++)
            {
                if(i % mvalue == 0)
                    return false;
            }   
        }
        return true;
    }
    public static boolean isEven(int value)
    {
        return (value % 2)==0;
    }
    public static boolean isOdd(int value)
    {
        return (value % 2)==1;
    }
    public static boolean isPrime(int value)
    {
        if(value == 1 || value == 2)
        {
            return true;
        }
        else
        {
            for(int i = 2 ; i<value ; i++)
            {
                if(i % value == 0)
                    return false;
            }   
        }
        return true;
    }
    public static boolean isEven(MyInteger value)
    {
        return value.isEven();
    }
    public static boolean isOdd(MyInteger value)
    {
        return value.isOdd();
    }
    public static boolean isPrime(MyInteger value)
    {
        return value.isPrime();
    }
    public boolean equals(int value)
    {
        return (value == mvalue);
    }
    public boolean equals(MyInteger value)
    {
        return value.equals(mvalue);
    }
    public static int parseInt(char[] value)
    {
        int counter = 1;
        int sum = 0;
        for (int i = value.length-1; i>=0;i-- )
        {
            if(value[i]>=48 && value[i]<=57)
            {
                sum += (value[i]-'0')*counter;
                counter*=10;
            }
            else 
                System.out.println("\nException error: string cant contain alphabets");
        }
        return sum;
        
        //return parseInt(new String(value));
    }
    public static int parseInt(String value)
    {
        return MyInteger.parseInt(value.toCharArray());
    }
            
    
        
    
}
