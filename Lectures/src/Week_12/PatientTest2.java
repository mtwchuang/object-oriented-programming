package Week_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.function.Executable;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest2 {

    Patient2 p;

    @BeforeEach
    void setUp() {
        p = new Patient2();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Make sure single run works")
    void getBodyTemperatureTest() {
//        assertEquals(300-273.15, p.getBodyTemperature(300), "Failed");
       assertEquals(formatter(300-273.15), p.getBodyTemperature(300), "Passed! Great!");

        // assertEquals(300-273.15, p.getBodyTemperature(300));
//        assertEquals(formatter(300-273.14), p.getBodyTemperature(300)); //failed
//        assertEquals(formatter(300-273.15), p.getBodyTemperature(300)); //pass
//        assertEquals(formatter(300-273.16), p.getBodyTemperature(300)); //failed

    }

    @org.junit.jupiter.api.RepeatedTest(300)
    //work withtimeout method??!?!?
    @DisplayName("Make sure repeat run works")
    void getBodyTemperatureRepeated() {
        //how can we change this?
        int r = getRandomNumber(1,500);
        assertEquals(formatter(r-273.15), p.getBodyTemperature(r));
    }

    //dont reinvert the wheel
    //violate the DRY theory
    private String formatter(double in){
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(in);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
