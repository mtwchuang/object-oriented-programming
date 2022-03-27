package Week_11;
public class HospitalMain 
{
    public static void main(String[] args)
    {
        PatientData pd1 = new PatientData();
        String testkelvin = pd1.getAllTempKelvin(0);
        System.out.println(pd1.convertKelvinToCelsius(testkelvin));
    }

}
