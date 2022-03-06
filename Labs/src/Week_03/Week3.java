package Week_03;
import java.util.Scanner;
public class Week3 
{
    public void tutorialQ1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years an integer: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        Loan l1 = new Loan(annualInterestRate,numberOfYears,loanAmount);
        System.out.println("The loan was created on "+l1.getLoanDate());
        System.out.println("The monthly payment is "+String.format("%.2f", l1.getMonthlyPayment()));
        System.out.println("The total payment is "+String.format("%.2f", l1.getTotalPayment()));
        input.close();   
    }
}
