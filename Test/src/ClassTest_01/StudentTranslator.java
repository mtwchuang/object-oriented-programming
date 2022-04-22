package ClassTest_01;
public class StudentTranslator extends StudentHelper
{
    // translator attribute
    private String bestLang;
    // constructor
    public StudentTranslator(String SID, String pos, int a, int h, String bestL) {
        super(SID, pos, a, h);
        this.bestLang=bestL;
    }
    // getters and setters
    public String getBestLang() {
        return this.bestLang;
    }

    public void setBestLang(String bestLang) {
        this.bestLang = bestLang;
    }
    // methods
    public void printInfo()
    {
        System.out.println("Student ID: "+this.studID+" Position: "+this.position+" Salary: "+this.salary+" Best Spoken Language: "+this.bestLang);
    }
}
