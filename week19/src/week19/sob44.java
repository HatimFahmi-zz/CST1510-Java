/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class sob44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
// Check command line parameter usage

    Scanner in =new Scanner(System.in);
           
    while(true){
        System.out.println("Enter filename: ");
        String s=in.next();

        File file = new File(s);
        if (!file.exists())
        {
            System.out.println("File " + s + " does not exist");
        }
        else
        {try{
            in = new Scanner(file);                
            int characters = 0;	// Number of character
            int words = 0;			// Number of words
            int lines = 0;			// Number of lines

            while(in.hasNextLine()) 
            {		
                lines++;
                String lineS = in.nextLine();
                String[] line = lineS.split(" ");
                words += line.length;
                for (String word : line) characters += word.length();

            }
            in.close();
            System.out.println("File " + file.getName() + " has");
            System.out.println(characters + " characters");
            System.out.println(words + " words");
            System.out.println(lines + " lines");  


        }catch(IOException e)
        {
            System.out.println(e);
        }
        // Display results
        break;
        }
    }
    }
}
    
  
