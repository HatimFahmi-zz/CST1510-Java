/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class testStrings {
    String str1;
    String str2;
    String str;
   
    testStrings()
    {
        str1=null;
        str2=null;
        str=null;
    }
    
    testStrings(String s1, String s2)
    {
        str1 = s1;
        str2 = s2;
    }
    public void assign(String s1, String s2)
    {
        str1 = s1;
        str2 = s2;
    }
    public void conStrings()
    {
        str = str1.concat(str2);
    }
    public void manipulateStrings()
    {
        str = str1 + str2;
    }
    public void printStrings()
    {
        System.out.printf("%s+%s = %s", this.str1, this.str2, this.str);
        System.out.println();
    }
}
