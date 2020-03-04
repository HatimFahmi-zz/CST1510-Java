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
public class rectangle {
    double length;
    double breadth;
    String color;
    rectangle(double l,double b,String color){
        this.length=l;
        this.breadth=b;
        this.color=color;
    }
    public void setlength(int l){
        this.length=l;
    }
    public void setbreadth(int b){
        this.breadth=b;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public double getarea()
    {
        double area;
        area = length*breadth;
        return area;
    }
    public double getperimeter(){
        double perimeter;
        perimeter=2*(length+breadth);
        return perimeter;
    }
}
