package Week_08;
import java.util.Scanner;
public class NumFormatExceptHandling 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try
            {
                System.out.println("Enter input for float conversion: ");
                String input = sc.nextLine();
                float amount = Float.valueOf(input);
                System.out.println("Converted float is: " +amount);
                break;
            }
            // to catch inappropriate string to numeric format
            catch(NumberFormatException e)
            {
                System.out.println("Exception occured "+e);
            }
        }
        sc.close();
    }    
}
