package Week_04;
public class StackOfIntegers 
{
    // Class attributes
    private int size = 16;
    private int[] elements;
    private int top = -1;
    // Constructors
    public StackOfIntegers()
    {
        this.elements = new int[size];
    }
    public StackOfIntegers(int capacity)
    {
        this.size=capacity;
        this.elements = new int[capacity];
    }
    public void push(int value)
    {
        if(top<15)
        {
            elements[++top] = value;
        }
        else
        {
            System.out.println("Error, Stack is full. Value rejected");
            System.exit(-1);
        }
    }
    public int pop()
    {
        if(empty()==true)
        {
            System.out.println("Error, Stack is empty. Pop is rejected");
            System.exit(-1);
        }
        return elements[top--];
    }
    public int getSize()
    {
        return size;
    }
    public boolean empty()
    {
        return (top==-1);
    }
    public int peek()
    {
        if(empty()==true)
        {
            System.out.println("Error, Stack is empty.");
            System.exit(-1);
        }
        return elements[top];

    }
}