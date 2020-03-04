/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.GregorianCalendar;

/**
 *
 * @author hatim
 */
public class MyDate 
{
    private int year;
    private int month;
    private int day;

    MyDate() 
    {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
	day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    MyDate(long elapsedTime) 
    {
        setDate(elapsedTime);
    }
    MyDate(int year, int month, int day) 
    {
        this.year = year;
	this.month = month;
        this.day = day;
    }
    public int getYear() 
    {
        return year;
    }

    public String getMonth() 
    {
        String m = String.valueOf(month + 1);
	return (month < 10 ? "0" + m : m);
    }

    public String getDay() 
    {
        String d = String.valueOf(day);
	return (day < 10 ? "0" + d : d);   
    }

    public void setDate(long elapsedTime) 
    {
        GregorianCalendar calander = new GregorianCalendar();
	calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
	month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    } 
}