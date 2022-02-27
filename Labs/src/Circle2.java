public class Circle2 extends Shape
{
    public Circle2(double radius1, double radius2)
    {
        super(radius1,radius2);
    }
    public double area()
    {
        return (PI*super.dim1*super.dim2);
    }      
}
