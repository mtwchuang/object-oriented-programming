package Lectures.Week_4;
public class Student extends Person
{
    public String rollNumber;
    public int marks;
    public Student()
    {

    }
    public Student(String n, int w, String a, String r, int m)
    {
        super(n,w,a);
        this.rollNumber = r;
        this.marks = m;
    }
    public void sayHello()
    {
        System.out.println("Hi! My name is "+this.name+" and I am a student!");
    }
    public static void main(String[] args)
    {
        // call child constructor to initialise parent object
        Person a = new Student("Thomas", 70, "24 Bishan", "1603115E",79);
        // child constructor takes in more fields than parent object can hold and is casted
        System.out.println(a.name);
        System.out.println(a.weight);
        System.out.println(a.address);
        // hence, some child attributes for example, rollNumber and marks are truncated
        // System.out.println(a.rollNumber);
        // System.out.println(a.marks);
        // however something interesting is that because a child constructor is used, method of child still overrides
        a.sayHello();
    }
}
