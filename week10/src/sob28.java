public class sob28 {
    public static void main(String[] args) 
    {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        fan1.setSpeed("FAST");
        fan1.setRadius(12);
        fan1.setColor("green");
        fan1.fanOn();
        
        fan2.setSpeed("MEDIUM");
        fan2.setRadius(6);
        fan2.setColor("red");
        fan2.fanOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

 }


