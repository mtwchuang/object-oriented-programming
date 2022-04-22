package Lectures.Week_2;
public class Combine 
{   
    static double radius;   
    Combine() 
    {   
        radius = 1;   
    }   
       
    Combine(double newRadius)
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
       
    static void setRadius(double newRadius) 
    {   
        radius = newRadius;   
    }
    
    public static void main(String [] args){
      CombineTest ct = new CombineTest();
      ct.test();
    }
}

class CombineTest {
  public static void test() { 
      Combine circle1 = new Combine();
      System.out.println("The area of the circle (" + circle1.radius + "): " + circle1.getArea());
      Combine circle2 = new Combine(10);
      System.out.println("The area of the circle (" + circle2.radius + "): " + circle2.getArea());
      Combine circle3 = new Combine(50);
      System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());
      Combine.setRadius(100);
      System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());
    }
}