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
public class square {
   double side;
    String color;
    square(double r,String color){
        this.side=r;
        this.color=color;
    }
    public void setside(int r){
        this.side=r;
    }
    public void setcolor(String color){
        this.color=color;
    }
     public double getarea()
    {
        double area;
        area = Math.pow(side, side);
        return area;
    }
     public double getperimeter(){
        double perimeter;
        perimeter=4*side;
        return perimeter;
    }
    
    
}
