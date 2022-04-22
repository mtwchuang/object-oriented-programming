public class ExceptionPractice 
{
    public static void main(String args[]) {
        int d = 0;
        int n = 20;
        try 
        {
            int fraction = n / d;
            System.out.println(fraction);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("In the catch Block due to Exception = " + e.getLocalizedMessage());
        }
    }   
}
