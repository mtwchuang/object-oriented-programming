package Week_11;
public class Patient 
{
    private String patCode;
    private String name;
    private int age;
    private float temperature;
    public Patient(String n, int a, float t)
    {
        this.name=n;
        this.age=a;
        this.temperature=t;
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

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void printPatientInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Temperature: "+this.temperature);
    }
}
