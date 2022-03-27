package Week_11;

public class CovidPatient extends Patient
{
    private boolean covidTest;
    public CovidPatient(String n, int a, float t, boolean ct)
    {
        super(n,a,t);
        this.covidTest=ct;
    }
    public boolean getCovidTest() {
        return this.covidTest;
    }

    public void setCovidTest(boolean covidTest) {
        this.covidTest = covidTest;
    }

}
