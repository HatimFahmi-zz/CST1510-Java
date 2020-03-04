/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class sob31 {

    public static void main(String[] args) {
        
        MyDate D1 = new MyDate();
        MyDate D2 = new MyDate(43455555133101L);
        
        System.out.println("Year " + D1.getYear());
        System.out.println("Month " + D1.getMonth());
        System.out.println("Day " + D1.getDay());

        System.out.println("\nYear " + D2.getYear());
        System.out.println("Month " + D2.getMonth());
        System.out.println("Day " + D2.getDay());
        


    }
    
}
