package Week_02;
import java.util.Scanner;
public class Week2
{
    public final static double PI = 3.14159;
    public void tutorialQ1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a number for radius: ");
        float radius = input.nextFloat();
        System.out.print("The area for the circle of radius "+radius+" is "+getArea(radius));
        input.close();
    }
    public double getArea(float r)
    {
        return r*r*PI;
    }
    public void tutorialQ2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        String strInput = "";
        int inputcounter = 0;
        float floatArray[] = new float[3];
        while(inputcounter < floatArray.length)
        {
            strInput = input.nextLine();
            String tempString[] = strInput.split("\\s",3);
            for(int i = 0; i<tempString.length; i++)
            {
                floatArray[i+inputcounter] = Float.parseFloat(tempString[i]);
            }
            inputcounter+=tempString.length;
        }
        double average = getAverage(floatArray[0],floatArray[1],floatArray[2]);
        System.out.print("The average of "+floatArray[0]+" "+floatArray[1]+" "+floatArray[2]+" is "+average);
        input.close();
    }
    public double getAverage(float f1, float f2, float f3)
    {
        return (f1+f2+f3)/3;
    }
    public void tutorial03()
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000, currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60, currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60, currentHours = totalHours%24;
        System.out.format("Current time is %d:%d:%d GMT\n",currentHours,currentMinutes,currentSecond);
    }
    public void tutorial04()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int inputYear = input.nextInt();
        switch(inputYear%12)
        {
            case(0):
            {
                System.out.println("monkey");
                break;
            }
            case(1):
            {
                System.out.println("rooster");
                break;
            }
            case 2:
            {
                System.out.println("dog");
                break;
            }
            case 3:
            {
                System.out.println("pig");
                break;
            }
            case 4:
            {
                System.out.println("rat");
                break;
            }
            case 5:
            {
                System.out.println("ox");
                break;
            }
            case 6:
            {
                System.out.println("tiger");
                break;
            }
            case 7:
            {
                System.out.println("rabbit");
                break;
            }
            case 8:
            {
                System.out.println("dragon");
                break;
            }
            case 9:
            {
                System.out.println("snake");
                break;
            }
            case 10:
            {
                System.out.println("horse");
                break;
            }
            case 11:
            {
                System.out.println("sheep");
                break;
            }
        }
        input.close();
    }
}
