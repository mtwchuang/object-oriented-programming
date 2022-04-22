package Week_11;
public class PatientData 
{
    final static float KELVINTOCELCIUS = 273.15f;
    String[] name= {"Matthew","Luke","Mark"};
    int[] age = {23,20,19};
    float[] tempcelsius = {39.3f, 38.1f, 37.5f};
    String[] tempkelvin = {"312.45","311.25","310.65"};

    public String getAllName(int i) {
        return this.name[i];
    }

    public int getAllAgeint(int i) {
        return this.age[i];
    }

    public float getAllTempCelsius(int i) {
        return this.tempcelsius[i];
    }
    
    public String getAllTempKelvin(int i)
    {
        return this.tempkelvin[i];
    }
    public float convertKelvinToCelsius(String k)
    {
        return (Float.parseFloat(k) - KELVINTOCELCIUS);
    }
}