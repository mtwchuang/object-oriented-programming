package Week_12;

public class PatientData {
    String[] name = {"Peter", "John", "Mary"};
    int[] age = {10, 20, 30};
    String[] temperature = {"310.95", "311.65", "312.95"};

    public String getName(int index) {return name[index];}
    public int getAge(int index) {return age[index];}
    public String getTemperature(int index) {return temperature[index];}
}
