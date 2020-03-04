/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hatim
 */
public class sob32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		// Create to char arrays
            char[] test = {'H', 'a', 't', 'i', 'm'};
            char[] test2 = {'S', 'a', 'i', 'f'};

            // Create two MyString1 objects
            MyString1 str = new MyString1(test);
            MyString1 str2 = new MyString1(test2);

            // Display character at index 1 of MyString1 object 1
            System.out.println("\nCharacter at index 1 of MyString1 object 1: " + str.charAt(1));

            // Display the length of MyString1 object 1
            System.out.println("\nLength of MyString1 object 1: " + str.length());


            // Display a Substring from index 2 to 4 of MyString1 object 1
            System.out.println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
            MyString1 substr = str.substring(2,4);
            for (int i = 0; i < substr.length(); i++) {
                    System.out.print(substr.charAt(i));		
            }
            System.out.println();

            // Display MyString1 object 1 as lowercase:"
            System.out.println("\nMyString1 object 1 to lowercase:");
            MyString1 lower = str.toLowerCase();
            for (int i = 0; i < lower.length(); i++) 
            {
                    System.out.print(lower.charAt(i));		
            }
            System.out.println();

            // Test if MyString1 object 1 is equal to MyString1 object 2
            System.out.println("\nMyString1 object 1 is equal to MyString1 object 2? " + str.equals(str2));

            // Display the integer 145 as a MyString1 object
            System.out.println("\nDisplay the integer 145 as a MyString1 object: ");
            MyString1 value = MyString1.valueOf(-145);
            for (int i = 0; i < value.length(); i++)
            {
                System.out.print(value.charAt(i));		
            }
            System.out.println();

	}    
}
    

