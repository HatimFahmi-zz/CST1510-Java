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
public class Week19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> text = new ArrayList<String>();
               
        try{
//            FileWriter fw = new FileWriter("newtextfile.txt");
//            fw.write("hello world"); for writing into a file
//            fw.close();
            File f = new File("newtextfile.txt");
            Scanner s = new Scanner(f);
            
            while(s.hasNextLine())
            {
                while(s.hasNext())
                    text.add(s.nextLine());
            }
            System.out.println(text);
            
            
            
            
//            File file = new File("myfiles");
//      //Creating the directory
//            boolean bool = file.mkdir();
//            if(bool){
//                    System.out.println("Directory created successfully");
//                    }
//            else{
//                    System.out.println("Sorry couldn’t create specified directory");
//                }
//            
//            
//            File f = new File ("myfiles/newtextfile.txt");
//            if(f.createNewFile()){
//                System.out.println("File created");
//                
//            }
//            else
//                {
//                System.out.println("File already exists");
//                }
//            System.out.println(f.getAbsoluteFile());

            }
        catch(IOException e)
        {
                System.out.println("File not found");
        }
        
        // TODO code application logic here
    }
    
}
