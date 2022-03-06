package Week_05;
public class Triangle extends Shape
{
    public Triangle(double width, double height)
    {
        super(width, height);
    }
    @Override
    public double area() {
        return 0.5*super.dim1*super.dim2;
    }
        
}
