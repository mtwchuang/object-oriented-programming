package Week_12;

/*
This file model how the COVID Patient class extended from
it's superclass, Patient, to further address the need for the
specific test for this type of patient: covid test
 */
public class COVIDPatient2 extends Patient2 {
    public COVIDPatient2(String name, int age, double temperature, boolean covidTest) {
        super(name, age, temperature);
        System.out.println("Last COVID test: " + covidTest);
    }
}