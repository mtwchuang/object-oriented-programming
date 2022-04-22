package Week_02;

public class SalariedEmployee extends Employee
{
    int salary;
    public SalariedEmployee()
    {

    }
    public SalariedEmployee(String a, int b, int c)
    {
        // super() used to call out parent class constructor
        // super(a,b) could be used here

        // super.[variable] used to call parent class variables/methods
        super.name=a;
        super.age=b;
        this.salary=c;
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Employee emp = new Employee();
        SalariedEmployee semp = new SalariedEmployee("Lack",24,100);
        System.out.println(emp.name+" "+emp.age);
        System.out.println(semp.name+" "+semp.age+" "+semp.salary);
        // Cloning semp into object reference variable clone
        Employee clone = (Employee) semp.clone();
        //Check if semp and clone have the same memory address
        System.out.println(semp!=clone);
        
        emp.sayHello();
        semp.sayHello();
    }
}
