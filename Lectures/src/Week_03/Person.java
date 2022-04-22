package Week_03;

public class Person
{
    private String name;
    private String address;
    private Account account;
    public Person(String inputname, String inputaddress)
    {
        this.name = inputname;
        this.address = inputaddress;
        this.account = null;
    }
    public void setName(String inputname)
    {
        this.name = inputname;
    }
    public void setAddress(String inputaddress)
    {
        this.address = inputaddress;
    }
    public void setAccount(Account inputaccount)
    {
        this.account = inputaccount;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public Account getAccount()
    {
        return this.account;
    }  
}
