
import java.util.InputMismatchException;
import java.util.Scanner;

public class sob37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("This program multiplies two numbers");

    while (true) 
    {
          try {
            System.out.println("Enter the first integer: ");
            int num1 = s.nextInt();
            System.out.println("Enter the second integer: ");
            int num2 = s.nextInt();
            System.out.printf("%nThe product of %d & %d is: %d", num1, num2, (num1 * num2));
            break;
          } catch (InputMismatchException e) {
            System.out.println("Wrong input type; Try again!!!\n");
        s.next();
      }
    }   
    }
    
}
