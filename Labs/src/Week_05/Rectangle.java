package Week_05;
public class Rectangle extends GeometricObject
{
    // attributes
    private double width;
    private double height;
    // constructors
    public Rectangle()
    {

    }   
    public Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    } 
    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        this.width=width;
        this.height=height;
    }
    // getter and setters

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // methods
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return (2*width+2*height);
    }
}
