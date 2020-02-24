/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class MyString1
{
    private char[] chars;

    public MyString1(char[] chars) 
    {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++)
            this.chars[i] = chars[i];
    }

    public char charAt(int index) 
    {
        return chars[index];
    }

	/** Return length */
    public int length() 
    {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) 
    {
        char[] ch = new char[end - begin];
	for (int i = begin, j = 0; i < end; i++, j++) 
        {
            ch[j] = chars[i];
	}
        return new MyString1(ch); 
    }

    public MyString1 toLowerCase() 
    {
        char[] ch = new char[chars.length];
	for (int i = 0; i < chars.length; i++) 
        {
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                ch[i] = (char)(chars[i] + 32);
            else
                ch[i] = chars[i];
	}
        return new MyString1(ch);
    }

    public boolean equals(MyString1 s) 
    {
        if (chars.length != s.length())
            return false;
	for (int i = 0; i < chars.length; i++) 
        {
            if(chars[i] != s.charAt(i))
                return false;
	}
	return true;
    }

    public static MyString1 valueOf(int i) 
    {
	/*int length = 0; 
        int n = i;
	while (n >= 1) 
        {
            n /= 10;
            length++;
	}
        // Create a char array of the length of i
        char[] ch = new char[length];
        // Copy the digits in i to the array
	for (int j = 0; j < length ; j++)
            for(int k = (int)Math.pow(10, length - 1) ; ; k/=10)
        {
            if(k>0)
            {
                ch[j] = Character.forDigit((i / k), 10);
                i %= k; 
            }
	}*/
       

        char[] ch = ("" + i).toCharArray();

        return new MyString1(ch);
    }
}
