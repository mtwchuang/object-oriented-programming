package Week_05;
public class Ellipse extends Shape
{
    public Ellipse(double majoraxis, double minoraxis)
    {
        super(majoraxis,minoraxis);
    }
    public double area()
    {
        return (super.PI*super.dim1*super.dim2);
    }
}
