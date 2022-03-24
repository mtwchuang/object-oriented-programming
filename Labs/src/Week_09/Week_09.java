package Week_09;
import org.junit.Test;
import java.util.Random;
public class Week_09 
{
    @Test
    public void tutorialQ1()
    {
        RandomCharacter rc = new RandomCharacter();
        int length = 15;
        for(int i = 0; i < length; i++)
        {
            System.out.println(rc.getRandomLowerCaseLetter());
        }

        for(int i = 0; i < length; i++)
        {
            System.out.println(rc.getRandomUpperCaseLetter());
        }
        for(int i = 0; i < length; i++)
        {
            System.out.println(rc.getRandomDigitCharacter());
        }

        for(int i = 0; i < length; i++)
        {
            System.out.println(rc.getRandomCharacter());
        }
    }
    @Test
    public void tutorialQ2()
    {
        RandomCharacter rc = new RandomCharacter();
        Random rand = new Random();
        int randnum = rand.nextInt(0,101);
        System.out.println("Generated num: "+randnum);
        boolean isPrime = true;
        // check if number is divisible by any other number without remainder
        for(int i = 2; i < randnum; i++)
        {
            if(randnum % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        System.out.println("Number is prime: "+isPrime);
    }
}
