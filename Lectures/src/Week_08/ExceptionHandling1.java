package Week_08;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String modules[] = {"CSC1009","CSC1010","CSC1011"};
        while(true)
        {
            try
            {
                System.out.println("Enter index of course code you want to print: ");
                int input = sc.nextInt();
                System.out.println(modules[input]);
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Exception occured: "+e);
                sc.next();
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception occured: "+e);
            }
        }
        sc.close();
    }
}
