package week5;
import java.util.Scanner;
/**
 *
 * @author hatim
 */
public class sob17 {
    public static void main(String[] args)
    {
        int sum=1;
        double t=10000.00;
        
        for(int i=1;i<=14;i++)
        {
            if(i<=10)
                System.out.println(i + ".Tution =" +t+ " dollars");
            else if(i>10 && i<15)
                sum+=t;
            if(i==14)
                        System.out.println(sum+" dollars for four yearsa of tution");
            t*=1.06;

        }
        
        
        
    }
}