/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class testSwitch {
    int[] a;
    int[] a1 = {1, 2, 3, 4, 5};
    int[] a2 = {10, 20, 30, 40, 50};
   
    public testSwitch()
    {
        a = new int[5];
    }
    public void printArray()
    {
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public void addArray()
    {
        for(int i=0; i<a1.length-1; i++)
        {
            a[i]=a1[i]+a2[i];
        }
    }
    public void subArray()
    {
        for(int i=0; i<a1.length-1; i++)
        {
            a[i]=a2[i]-a1[i];
        }
    }
    public void manipulateArray(char op)
    {
        if(op=='a' || op=='A')
            addArray();
        else if(op=='s' || op=='S')
            subArray();
        else
            System.out.println("Wrong choice");
    }
        
}
