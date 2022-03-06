package Week_08;
import java.util.Scanner;
public class BankDemoTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CheckingAccount a1 = new CheckingAccount(12345, 1000);
        System.out.println("Enter deposit amount: ");
        double depositvalue = input.nextDouble();
        a1.deposit(depositvalue);
        try
        {
            System.out.println("Enter withdraw amount: ");
            double value = input.nextDouble();
            a1.withdraw(value);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.getClass().getSimpleName()+" Sorry but your account is short by "+e.getAmount());
        }
        input.close();
    }
}
