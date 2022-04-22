package Week_02;

public class CircleTest {
    public static void main(String[] args) { 
        Circle circle1 = new Circle();
        System.out.println("The area of the circle (" + circle1.radius + "): " + circle1.getArea());
        Circle circle2 = new Circle(10);
        System.out.println("The area of the circle (" + circle2.radius + "): " + circle2.getArea());
        Circle circle3 = new Circle(50);
        System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());
        circle3.setRadius(100);
        System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());
      }
  }