package Week_08;
public class TryCatchBlock
{
    public void Example01()
    {
        try
        {
            String input = "";
            float amount = Float.valueOf(input);
            System.out.println(amount);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Amount exception caught: "+e.getMessage());
        }
    }
    public void Example02()
    {
        try
        {
            String input = "";
            float amount = Float.valueOf(input);
            System.out.println(amount);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Amount exception caught: "+e.getMessage());
        }        
    }
    // IllegalArgumentException gets caught because it's a superclass of NumberFormatException
    public void Example03()
    {
        try
        {
            String input = "";
            float amount = Float.valueOf(input);
            System.out.println(amount);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Amount exception caught: "+e.getMessage());
        }          
    }

    public static void main(String[] args)
    {
        TryCatchBlock tcb = new TryCatchBlock();
        tcb.Example01();
        // tcb.Example02();
        // tcb.Example03();

    }
}
