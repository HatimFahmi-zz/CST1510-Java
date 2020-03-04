/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class Fan {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    public int speed ;
    public boolean on ;
    public double radius ;
    public String color = "blue";

    Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    boolean fanOn() 
    {
    on = true;
    return on;
    }
    boolean fanOff() 
    {
    on = false;
    return on;
    }
    void setSpeed(String newspeed) 
    {
        if ("SLOW".equals(newspeed)) 
        {
            speed = SLOW;
        } 
        else if ("MEDIUM".equals(newspeed))   
        {
            speed = MEDIUM;
        } 
        else if ("FAST".equals(newspeed)) 
        {
           speed = FAST;
        } 
        else  
        {
        System.out.println( "Please enter 'SLOW', 'MEDIUM' or 'FAST' to change the speed of the fan.");
        }
    }
    double setRadius(double rad) 
    {
    radius  = rad;
    return radius;
    }
    void setColor(String colorType) 
    {
    color = colorType;
    }
    public String toString()
    {
        if(on)
            return ("\nSpeed: " + speed + "\nRadius: " + radius + "\nColor: " +color + "\nOn: " + on);
        else
            return ("\nSpeed: " + speed + "\nRadius: " + radius + "\nColor: " +color + "\nfan is off" );        
    }
}

