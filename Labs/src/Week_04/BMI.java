package Week_04;
public class BMI 
{
    // attributes and constants
    static final double LBCONVERTER = 0.45359237;
    static final double INCONVERTER = 0.0254;
    private double weightlb;
    private double heightin;
    // constructors
    public BMI()
    {

    }
    public BMI(double w, double h)
    {
        this.weightlb=w;
        this.heightin=h;
    }
    // getters and setters
    public double getWeightlb() {
        return this.weightlb;
    }

    public void setWeightlb(double weightlb) {
        this.weightlb = weightlb;
    }

    public double getHeightin() {
        return this.heightin;
    }

    public void setHeightin(double heightin) {
        this.heightin = heightin;
    }

    // methods
    public double getBMI()
    {
        double weightkg = this.weightlb*LBCONVERTER;
        double heightm = this.heightin*INCONVERTER;
        return weightkg/(heightm*heightm);
    }
    public String getBMIRange()
    {
        double bmi = getBMI();
        if(bmi < 18.5)
        {
            return "Underweight";
        }
        else if(bmi >=18.5 && bmi < 25.0)
        {
            return "Normal";
        }
        else if(bmi >=25.0 && bmi < 30.0)
        {
            return "Overweight";
        }
        else if(bmi >= 30.0)
        {
            return "Obese";
        }
        else
        {
            System.out.println("Error has occured");
            return null;
        }     
    }

}