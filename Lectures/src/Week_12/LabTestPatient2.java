package Week_12;

/*
This file model how the Lab Test Patient class extended from
it's superclass, Patient, to further address the need to the various
kind of procedure in the laboratory
 */
public class LabTestPatient2 extends Patient2 {
    public LabTestPatient2(int age, double temperature, String labCode) {
        super(null, age, temperature);
        String procedure = null;
        switch(labCode) {
            case "L01":
                procedure = "Blood Test";
                break;
            case "L02":
                procedure = "Liver Test";
                break;
            default:
                procedure = "unknown";
        }
        System.out.println("Lab Test: " + procedure);
    }
}
