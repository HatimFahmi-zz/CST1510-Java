/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author hatim
 */
public class sob18 {
      public static double mileToKilometer(double mile)        
      {
          double km = mile*1.6; 
          return km;
      }
      public static double KilometerToMile(double kilometer)
      {
          double mile =kilometer/(1.6); 
          return mile;
      }
      
      public static void main(String[] args)
         {
             double mile=0;
             double km=15;
             System.out.println("Miles |\t Kilometer\t\tKilometers |\t Miles");
             
             
             for(int i = 1; i<=10;i++)
             {
                
                  mile++;
                 km=km+5;
                 if(mile>2 && mile<9)
                    ;
                 else 
                 {
                         System.out.println(mile + "\t" + mileToKilometer(mile)+ "\t\t\t"+ km +"\t\t "+ KilometerToMile(km) );
                 }
                
             }
             }
             
         }
                 
                 



    

