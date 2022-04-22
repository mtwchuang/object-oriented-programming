package Week_04;
// child class SalariedEmployee derived from parent class Employee
public class SalariedEmployee extends Employee
{
    // attributes
    public int salary;
    // default constructor
    public SalariedEmployee()
    {

    }
    // constructor with parameters
    public SalariedEmployee(String n, int a, int s)
    {
        // to call the superclass constructor, we use super reference. this must only be done at the start of child constructor
        // super(n,a);
        // alternatively, we can also use super reference to reference superclass variables
        super.name=n;
        super.age=a;
        this.salary=s;
    }
    // child methods
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    // overridden method sayHello()
    // use super reference to call out supermethod
    @Override
    public void sayHello()
    {
        // super.sayHello();
        System.out.println("Hello! I am a paid employee");
    }
    // Overloading of sayHello() method
    public void sayHello(String occasion)
    {
        if(occasion=="formal")
        {
            System.out.println("Pleased to meet you Sir!");
        }
        else
        {
            System.out.println("Greetings fellow colleague");
        }
    }

    public static void main(String[] args)
    {
        // Initialise a normal employee
        Employee e1 = new Employee("Samuel",29);
        // Initialising an child object
        Employee s1 = new SalariedEmployee("Thomas",28,3000);
        // parent method vs overriding child method
        e1.sayHello();
        s1.sayHello();
        // s1.sayHello("formal");
        // System.out.println("Name of S1 is "+s1.getName()+"\nSalary of S1 is "+s1.getSalary());
        Employee e2 = new SalariedEmployee("Matthew",23,2500);
        e2.sayHello();
        
    }

}
