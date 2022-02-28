public class StudentProgrammer extends StudentHelper
{
    private String progLang;
    public StudentProgrammer(String SID, String pos, int a, int h, String progL) 
    {
        super(SID, pos, a, h);
        this.progLang=progL;
    }

    public String getProgLang() {
        return this.progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public void printInfo()
    {
        System.out.println("Student ID: "+this.studID+" Position: "+this.position+" Salary: "+this.salary+" Programming Language: "+this.progLang);
    }
}
