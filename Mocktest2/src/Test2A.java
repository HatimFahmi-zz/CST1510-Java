
import java.util.Scanner;

public class Test2A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = s.next();
        String s2 = s.next();
        testStrings t1 = new testStrings(s1, s2);
        
        testStrings t2 = new testStrings();
        t2.assign("String1","String2");
        t2.conStrings();
        t2.printStrings();
        
        testSwitch t3 = new testSwitch();
        t3.manipulateArray('a');
        
        t1.manipulateStrings();
        t1.printStrings();
    }
}

