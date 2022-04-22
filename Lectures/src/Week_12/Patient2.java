package Week_12;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
This file model the possible use to the abstract class,
and the way how different kind
 */
public class Patient2 extends VitalSign2 {

    final static double KelvinToCelsius = 273.15;
    public Patient2()
    {
        
    }
    public Patient2(String name, int age, double temperature) {
        System.out.print("Patient: " + name);
        System.out.print("\t\tAge: " + age);
        System.out.println("\t\tTemperature: " + this.getBodyTemperature(temperature));
    }

    public String getBodyTemperature(double kelvin) {
        //two actions here: (1) formatter (2) converstion
        //break these two actions into two separate method
        //so that you can do a better unit test

        double v = this.convertK2C(kelvin);
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(v);
    }

    private double convertK2C(double kelvin){
        return kelvin - KelvinToCelsius;
    }

}

