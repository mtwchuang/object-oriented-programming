package Week_08;
import java.util.Scanner;
public class CircleWithException
{
    final double PI = 3.14159;
    // attributes
    private double radius;
    // constructor
    public CircleWithException(double radius) throws Exception
    {
        setRadius(radius);
    }
    // getter and setter
    public double getRadius() 
    {
        return this.radius;
    }
    public void setRadius(double radius) throws Exception
    {
        if(radius < 0)
        {
            throw new IllegalArgumentException("Radius cannot be less than 0");
        }
        this.radius = radius;
        if(getArea() > 1000)
        {
            throw new Exception("Area is too big");
        }
    }
    // methods
    public double getArea()
    {
        double area = PI*radius*radius;
        return area;
    }
    public double getDiameter()
    {
        return 2*radius;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        CircleWithException c1 = null;
        while(!valid)
        {
            valid=true;
            try
            {
                System.out.println("Enter circle radius: ");
                double radius1 = input.nextDouble();
                c1 = new CircleWithException(radius1);
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e);
                valid = false;
            }
            catch(Exception d)
            {
                System.out.println(d);
                valid = false;
            }
        }
        System.out.println("The area of the circle is "+c1.getArea());
        input.close();


    }
}
