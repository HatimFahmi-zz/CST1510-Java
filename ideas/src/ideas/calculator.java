/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ideas;

import java.util.Scanner;

/**
 *
 * @author hatim
 */
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String a = input.next().replaceAll(" ","");
	a = a.replaceAll("[-]","#-#");
        a = a.replaceAll("[*]","#*#");
        a = a.replaceAll("[/]","#/#");
        args = a.split("#");
        int x = Integer.parseInt(args[0]);

        // Check number of strings passed
        if (args.length != 3)
        {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0))
        {
            case '+' : 
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-' :
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*' :
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/' :
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
    }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);	a = a.replaceAll("[+]","#+#");

	}
}
    
    

