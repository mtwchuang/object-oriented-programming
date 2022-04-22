package Lectures.Week_5;

public class Test 
{
    public static void main(String[] args)
    {
        // Instantiating car and boat objects
        Car c1 = new Car();
        Boat b1 = new Boat();
        c1.honk();
        b1.honk();
        // Take note, you cannot instantitate an abstract class (try uncommenting for error)
        // Vehicle v1 = new Vehicle();
    }    
}
