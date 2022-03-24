package Week_09;
import java.util.Random;
public class RandomCharacter 
{

    public char getRandomLowerCaseLetter()
    {
        Random rand = new Random();
        return (char)(rand.nextInt(26)+'a');
    }

    public char getRandomUpperCaseLetter()
    {
        Random rand = new Random();
        return (char)(rand.nextInt(26)+'A');
    }

    public int getRandomDigitCharacter()
    {
        Random rand = new Random();
        return rand.nextInt(0, 9);
    }
    
    public char getRandomCharacter()
    {
        Random rand = new Random();
        int uporlow = rand.nextInt(0,1);
        if(uporlow == 0)
        {
            return getRandomLowerCaseLetter();
        }
        else
        {
            return getRandomUpperCaseLetter();
        }
    }
}
