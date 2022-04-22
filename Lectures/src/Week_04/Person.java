package Lectures.Week_4;
public abstract class Person 
{
    public String name;
    public int weight;
    public String address;
    public Person()
    {

    }
    public Person(String n, int w, String a)
    {
        this.name = n;
        this.weight = w;
        this.address = a;
    }
    public abstract void sayHello();
    // {
    //     System.out.println("Hi! My name is "+this.name+" and I am a person!");
    // }
}
