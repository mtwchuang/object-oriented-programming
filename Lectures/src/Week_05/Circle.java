package Week_05;
public class Circle implements Circular
{
    private double radius = 1.0;
    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
    }
}
