/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author M00734828
 */
public class circle {
    
    double radius;
     String color;
    circle(){
        this.radius=1;
        this.color="white";
    }
    circle(double r,String c){
        this.radius=r;
        this.color=c;
    }
    public double getarea()
    {
        double area;
        area=Math.PI*radius*radius;
        return area;
    }
    public double getperimeter(){
        double perimeter;
        perimeter=2*Math.PI*radius;
        return perimeter;
    }
    private double gediameter(){
        return 2*radius;
        
    }
    public void setradius(double r){
        this.radius=r;
    }
    public void setcolor(String color){
        this.color=color;
    }
}
