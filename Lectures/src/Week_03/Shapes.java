package Week_03;
public class Shapes 
{
    private int length, breadth, radius;
    // Constructor for a circle
    public Shapes(int r)
    {
        this.radius=r;
    }
    // Constructor for a rectangle or square
    public Shapes(int l, int b)
    {
        this.length=l;
        this.breadth=b;
    }
    // Getter and Setters
    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) 
    {
        // Initialise a circle object with radius 6
        // Initialise a rectangle object with length 10 breadth 5
        Shapes circle = new Shapes(6);
        Shapes rectangle = new Shapes(10,5);
    }

}
