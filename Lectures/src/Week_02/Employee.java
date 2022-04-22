package Week_02;
// Defining Employee class and implementing Cloneable interface
public class Employee implements Cloneable
{
    public String name;
    public int age;
    public Employee()
    {
        name="dog";
        age=100;
    }
    public Employee(String a, int b)
    {
        this.name=a;
        this.age=b;
    }
    public void sayHello()
    {
        System.out.println("Hello Employees!");
    }
    // Calling out clone method from Cloneable
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
