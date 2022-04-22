package Week_04;
// parent class employee
public class Employee 
{
    // attributes
    protected String name;
    protected int age;
    // default constructor
    public Employee()
    {
        this.name="dog";
        this.age=100;
    }    
    // constructor with parameters
    public Employee(String n, int a)
    {
        this.name=n;
        this.age=a;
    }
    // parent methods
    public void sayHello()
    {
        System.out.println("Hello Employees!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // public static void main(String[] args)
    // {
    //     Employee e1 = new Employee("Samuel",29);
    //     e1.sayHello();
    // }
}
