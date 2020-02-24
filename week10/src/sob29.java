/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author hatim
 */

    
public class sob29 {
    public static void main(String[] args) 
    {
        GregorianCalendar calendar = new GregorianCalendar();
        
        System.out.println("Current month, day , year: ");
        System.out.println(calendar.get(calendar.MONTH)+"\t "+calendar.get(calendar.DAY_OF_MONTH)+"\t "+calendar.get(calendar.YEAR));
            
        calendar.setTimeInMillis(1234567898765L);
        
        System.out.println("\nElapsed time since Jan 1970: 1234567898765L");
        System.out.println(calendar.get(calendar.MONTH)+" "+calendar.get(calendar.DAY_OF_MONTH)+" "+calendar.get(calendar.YEAR));
    }
}
