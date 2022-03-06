package Week_05;
public class Rectangle2 extends Shape
{
    public Rectangle2(double width,double height)
    {
        super(width, height);
    }
    @Override
    public double area() {
        return super.dim1*super.dim2;
    }
        
}
