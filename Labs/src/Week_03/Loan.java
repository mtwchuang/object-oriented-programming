// File for Week 3
import java.util.Date;
public class Loan 
{
    // private attributes
    Date date = new Date();
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    // constructors
    public Loan()
    {

    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        this.loanDate=date;
    }
    // Getter and Setters
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }
    // Extra methods
    public double getMonthlyPayment()
    {
        double monthlyInterestRate = this.annualInterestRate/(12*100);
        double monthlyPayment = (this.loanAmount*monthlyInterestRate)/(1 - 1/Math.pow((1+monthlyInterestRate), this.numberOfYears*12));
        return monthlyPayment;
    }
    
    public double getTotalPayment()
    {
        double totalPayment = getMonthlyPayment()*this.numberOfYears*12;
        return totalPayment;
    }
}
