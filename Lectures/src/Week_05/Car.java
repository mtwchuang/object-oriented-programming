package Week_05;
public class Car extends Vehicle
{
    public Car()
    {

    }
    public Car(String n, int p)
    {
        super(n,p);
    }
    public void honk()
    {
        System.out.println("Beeeeeee!");
    }
}
