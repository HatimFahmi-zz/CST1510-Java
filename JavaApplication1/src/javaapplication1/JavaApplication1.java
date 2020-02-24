/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char at = 'a';
        System.out.println(at);
        System.out.println((char)64);
        
        char test = (char)0XAB0041;
        char test1 ='A';
        System.out.println(test==test1);
        
       char ch =(char) 66;
       System.out.println(ch);
       char qw = Character.toLowerCase(ch);
       System.out.println(qw);
       
       String name ="Hatim";
       System.out.println(name.charAt(name.length()));


    }
    
}
