package Lectures.Week_2;
// Class Header
public class Circle 
{
    // Attributes
    double radius;
    // Default constructor        
    Circle() 
    {   
        radius = 1;   
    }
    // Constructor with parameters  
    Circle(double newRadius) 
    {   
        radius = newRadius;   
    }   
       
    double getArea() 
    {   
        return radius * radius * Math.PI;   
    }   
       
    double getPerimeter() 
    {   
        return 2 * radius * Math.PI;   
    }   
       
    void setRadius(double newRadius) {   
        radius = newRadius;   
    }
    // public static void main(String [] args){
    //   Circle c = new Circle();
    //   System.out.println(c.getArea());
    //   System.out.println(c.getPerimeter());
    //   c.setRadius(2);
    //   System.out.println(c.getArea());
    //   System.out.println(c.getPerimeter());
    //   c.setRadius(3);
    //   System.out.println(c.getArea());
    //   System.out.println(c.getPerimeter());
    // }
}  