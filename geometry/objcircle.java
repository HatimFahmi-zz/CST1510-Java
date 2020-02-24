/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author M00734828
 */
public class objcircle {
    public static void main(String[] args){
       // circle c1=new circle();
        //System.out.println("this circle has parameter= "+ c1.getperimeter()+"area= " +c1.getarea());
        //System.out.println(" this circle has color "+ c1.color);
        
        //circle c2=new circle(5,"red");
        //c2.setradius(3);
        //System.out.println("this circle has parameter= "+ c2.getperimeter()+"area= "+c1.getarea());
        //System.out.println(" this circle has color "+ c2.color);
        
        circle[] c1=new circle[2];
        square[] c2=new square[2];
        rectangle[] c3=new rectangle[2];
        Scanner input=new Scanner(System.in);
        
        System.out.println(" enter value for circle ");
        for(int i=0;i<c1.length;i++){
            System.out.println(" circle "+(i+1));
            
            System.out.println("enter radius ");
            double r=input.nextDouble();
            System.out.println("enter color ");
            String color=input.next();
            
            c1[i]=new circle(r,color);
            
            
        }
        for(int i=0;i<c1.length;i++){
            System.out.println("the area of circle " + (i+1)+" is " + c1[i].getarea() + "the perimeter of circle " + (i+1) + " is " + c1[i].getperimeter());
            System.out.println(" this circle has color "+ c1[i].color);
        }
         System.out.println("\n enter value for square ");
        for(int i=0;i<c2.length;i++){
            System.out.println(" square"+(i+1));
            
            System.out.println("enter side ");
            double z=input.nextDouble();
            System.out.println("enter color ");
            String color=input.next();
            
            c2[i]=new square(z,color);
            
            
        }
        for(int i=0;i<c2.length;i++){
            System.out.println("the area of square " + (i+1)+" is " + c2[i].getarea() + " the perimeter of square " + (i+1) + " is " + c2[i].getperimeter());
            System.out.println(" this square has color "+ c2[i].color);
        }
        
        
         System.out.println("\n enter value for rectangle ");
        for(int i=0;i<c3.length;i++){
            System.out.println("rectangle"+(i+1));
            
            System.out.println("enter length ");
            double l=input.nextDouble();
            System.out.println("enter breadth ");
            double b=input.nextDouble();
            System.out.println("enter color ");
            String color=input.next();
            
            c3[i]=new rectangle(l,b,color);
            
            
        }
        for(int i=0;i<c3.length;i++){
            System.out.println("the area of rectangle " + (i+1)+" is " + c3[i].getarea() + " the perimeter of rectangle " + (i+1) + " is " + c3[i].getperimeter());
            System.out.println(" this rectangle has color "+ c3[i].color);
        }
        
        
    }
    
}
