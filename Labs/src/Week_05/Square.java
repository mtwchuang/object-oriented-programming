package Week_05;
public class Square extends Shape
{
    public Square(double width, double height)
    {
        super(width,height);
    }
    public double area()
    {
        return (super.dim1*super.dim2);
    }
}
