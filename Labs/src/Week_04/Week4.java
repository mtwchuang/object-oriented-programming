package Week_04;
import java.util.Scanner;
public class Week4 
{
    public void tutorialQ1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double inputweight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inputheight = input.nextDouble();
        BMI p1 = new BMI(inputweight,inputheight);
        System.out.println("BMI is "+p1.getBMI());
        System.out.println(p1.getBMIRange());
        input.close();
    }
    public void tutorialQ2()
    {
        StackOfIntegers stack = new StackOfIntegers();
        for(int i = 0; i < 10; i++)
        {
            stack.push(i);
        }
        while(!stack.empty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
