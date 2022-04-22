package Lectures.Week_5;
public abstract class Vehicle 
{
    protected String name;
    protected int noOfPassengers;
    public Vehicle()
    {

    }
    public Vehicle(String n, int p)
    {
        this.name=n;
        this.noOfPassengers=p;
    }
    public abstract void honk();
    public void park()
    {
        System.out.println("Reverse mode engaged, vehicle is parking...");
    }
}

