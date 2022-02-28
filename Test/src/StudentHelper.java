public class StudentHelper extends MasterPlan
{
    // constants
    public final static int MINAGE = 16;
    public final static int MINWAGEU18 = 4;
    public final static int MINWAGEO18 = 6;
    // attributes
    protected String studID;
    protected String position;
    protected int age;
    protected int hours;
    protected int salary;
    // constructor
    public StudentHelper(String SID, String pos, int a, int h)
    {
        this.studID=SID;
        this.position=pos;
        this.age=a;
        this.hours=h;
        this.salary=getSalary(a,h);
    }
    // getter setters
    public String getStudID() {
        return this.studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return this.salary;
    }
    // methods
    public int getSalary(int age, int hours)
    {
        if(age<MINAGE)
        {
            return 0;
        }
        else if(age<18)
        {
            return hours*MINWAGEU18;
        }
        else if(age>=18)
        {
            return hours*MINWAGEO18;
        }
        else
        {
            return 0;
        }
    }

    public void printInfo()
    {
        System.out.println("Student ID: "+this.studID+" Position: "+this.position+" Salary: "+this.salary);
    }
}
