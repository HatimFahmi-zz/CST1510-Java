/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week19;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author hatim
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               ArrayList<String> text = new ArrayList<String>();

         try{            
            File file = new File("mydata");
      //Creating the directory
            if(file.mkdir())
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Sorry couldn’t create specified directory");
            }
            
            
            File f = new File ("mydata/names.txt");
            File f1 = new File ("mydata/grades.txt");

            if(f.createNewFile()){
                System.out.println("File created");
                
            }
            else
                {
                System.out.println("File already exists");
                }
            
            if(f1.createNewFile()){
                System.out.println("File created");
                
            }
            else
                {
                System.out.println("File already exists");
                }
            PrintWriter fw = new PrintWriter("names.txt");
            fw.println("hatim");
            fw.println("firas");
            fw.println("safi");
            fw.close();
            
            PrintWriter fw1 = new PrintWriter("grades.txt");
            fw1.println("23");
            fw1.println("30");
            fw1.println("32");
            fw1.close();
            
            File ff = new File("names.txt");
            Scanner s = new Scanner(ff);
            
            while(s.hasNextLine())
            {
                while(s.hasNext())
                    text.add(s.nextLine());
            }
            System.out.println(text);         
         }
        catch(IOException e)
        {
                System.out.println("File not found");
        }
        
        // TODO code application logic here
    }
        // TODO code application logic here
        
    }
    

