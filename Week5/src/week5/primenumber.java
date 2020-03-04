package week5;

import java.util.Scanner;

    public class primenumber{
     
        public static void main(String[] args) {
     
            int i;
            int maxCheck; 
            boolean isPrime ;
            
            Scanner c =new Scanner(System.in);
            System.out.println("Enter limit:");
            maxCheck = c.nextInt();

            String primeNumbersFound = "";
     
            for (i = 1; i <= maxCheck; i++)
            {
                isPrime = CheckPrime(i);
                if (isPrime)
                {
                    primeNumbersFound = primeNumbersFound + i + " ";
                }
            }

            System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
            System.out.println(primeNumbersFound);
        }
        public static boolean CheckPrime(int numberToCheck) 
        {
            for (int i = 2; i <= numberToCheck / 2; i++)
            {
                if (numberToCheck % i == 0)
                {
                    return false;
                }
            }
            return true;
     
        }
     
    }