public class Recruitment 
{
    public static void main(String[] args)
    {
        SampleData sd = new SampleData();
        String[] samplestudNo = sd.getstudNo();
        String[] samplePosition = sd.getPosition();
        int[] sampleAge = sd.getAge();
        int[] sampleHours = sd.getHours();
        StudentHelper sh1 = new StudentHelper(samplestudNo[0],samplePosition[0], sampleAge[0], sampleHours[0]);
        StudentHelper sh2 = new StudentHelper(samplestudNo[1],samplePosition[1], sampleAge[1], sampleHours[1]);
        StudentProgrammer sp1 = new StudentProgrammer(samplestudNo[2], samplePosition[2], sampleAge[2], sampleHours[2], "Java");
        StudentTranslator st1 = new StudentTranslator(samplestudNo[3], samplePosition[3], sampleAge[3], sampleHours[3], "English");
        sh1.printInfo();
        sh2.printInfo();
        sp1.printInfo();
        st1.printInfo();
    }    
}
