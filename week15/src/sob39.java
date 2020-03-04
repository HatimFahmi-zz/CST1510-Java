
import java.util.Scanner;
import java.lang.NumberFormatException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**N
 *
 * @author hatim
 */
public class sob39  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("Enter a binary number: ");
                String bin = s.next();
                System.out.println("Decimal number: " +binToDec(bin));
                break;
            } catch(NumberFormatException e) {
                System.out.println("Your number is not binary\n");
            }

        }
    }

    public static int binToDec(String binary) {
        int result = 0, counter = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int c = binary.charAt(i) - '0';
            if (c != 0 && c != 1) throw new NumberFormatException("Your number isn't binary");
            result += (c) * Math.pow(2, counter);
            counter++;
        }

        return result;
    }    
    
}
