package Week_08;
public class CheckingAccount
{
    private int acctNum;
    private double bal;
    public CheckingAccount(int acctNum, double bal)
    {
        this.acctNum=acctNum;
        this.bal=bal;
    }
    public void deposit(double value)
    {
        this.bal=bal+value;
    }
    public void withdraw(double value) throws InsufficientFundsException
    {
        if(value>this.bal)
        {
            throw new InsufficientFundsException(value-this.bal);
        }
        this.bal=bal-value;
        System.out.println("The balance after withdraw is "+this.bal);
    }
    // getter
    public double getBalance()
    {
        return this.bal;
    }
    public int getNumber()
    {
        return this.acctNum;
    }
}
