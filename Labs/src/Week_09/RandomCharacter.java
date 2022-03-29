package Week_09;
import java.util.Random;
public class RandomCharacter 
{
    // function to generate lowercase letter
    public char getRandomLowerCaseLetter()
    {
        Random rand = new Random();
        return (char)(rand.nextInt(26)+'a');
    }
    // function to generate uppercase letter
    public char getRandomUpperCaseLetter()
    {
        Random rand = new Random();
        return (char)(rand.nextInt(26)+'A');
    }
    // function to generate a random digit between 0 and 9
    public int getRandomDigitCharacter()
    {
        Random rand = new Random();
        return rand.nextInt(0, 9);
    }
    // function to generate a random upper or lowercase letter
    public char getRandomCharacter()
    {
        Random rand = new Random();
        // random upper or lowercase
        int uporlow = rand.nextInt(0,1);
        // lowercase
        if(uporlow == 0)
        {
            return getRandomLowerCaseLetter();
        }
        // uppercase
        else
        {
            return getRandomUpperCaseLetter();
        }
    }
}
