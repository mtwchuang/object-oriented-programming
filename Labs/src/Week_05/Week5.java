package Week_05;
public class Week5 
{
    public void tutorialQ1()
    {
        Circle circle = new Circle(1);
        System.out.println("A circle "+circle.toString());
        System.out.println("The color is "+circle.getColor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The diameter is "+circle.getDiameter());

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("A rectangle "+rectangle.toString());
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("THe perimeter is "+rectangle.getPerimeter());        
    }   
    public void tutorialQ2()
    {
        Rectangle2 r = new Rectangle2(9,5);
        Triangle t = new Triangle(10,8);
        Circle2 c = new Circle2(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape figref;
        figref = r;
        System.out.println("Inside Area for Rectangle\nArea is "+figref.area());
        figref = t;
        System.out.println("Inside Area for Triangle\nArea is "+figref.area());
        figref = c;
        System.out.println("Inside Area for Circle\nArea is "+figref.area());
        figref = e;
        System.out.println("Inside Area for Ellipse\nArea is "+figref.area());
        figref = s;
        System.out.println("Inside Area for Square\nArea is "+figref.area());
    } 
}
