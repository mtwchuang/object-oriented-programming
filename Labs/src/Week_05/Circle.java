package Week_05;
public class Circle extends GeometricObject
{
    // attributes
    private double radius;
    // constructor
    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius=radius;
    }
    // getters and setters

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // methods
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return Math.PI*2*radius;
    }
    public double getDiameter()
    {
        return 2*radius;
    }
    public void printCircle()
    {
        System.out.println("The color is "+getColor()+
        "\nThe radius is "+getRadius()+
        "\nThe area is "+getArea()+
        "\nThe diameter is "+getDiameter()+
        "\nThe perimeter is "+getPerimeter());
    }
}
