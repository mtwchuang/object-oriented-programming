public abstract class Shape 
{
    final double PI = 3.14159;
    protected double dim1;
    protected double dim2;
    public Shape()
    {

    }
    public Shape(double d1, double d2)
    {
        this.dim1=d1;
        this.dim2=d2;
    }
    public abstract double area();
}
