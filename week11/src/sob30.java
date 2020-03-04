/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class sob30 {
    public static void main(String[] args){
       
        MyInteger int1 = new MyInteger(44);
        MyInteger int2 = new MyInteger(29);

        System.out.printf("\n%d is prime? %s", int1.getValue(), int1.isPrime());
        System.out.printf("\n%d is prime? %s", int2.getValue(), int2.isPrime());

        System.out.printf("\n%d is even? %s", int1.getValue(), int1.isEven());
        System.out.printf("\n%d is even? %s", int2.getValue(), int2.isEven());

        System.out.printf("\n73 is odd? %s", MyInteger.isOdd(73));
        
        System.out.printf("\ndoes %d equals %d? %s", int1.getValue(), int2.getValue(), int1.equals(int2));        

        System.out.printf("\n%d", MyInteger.parseInt("213"));
        System.out.printf("\nThe int value of string 424 is: %d", MyInteger.parseInt("424a"));
        
    } 

}
