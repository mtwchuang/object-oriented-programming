package Week_09;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.RepeatedTest;
public class RandomCharacterTest 
{
    RandomCharacter rc = new RandomCharacter();
    // repeated test 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomLowerCaseLetter()
    {
        int asciival = rc.getRandomLowerCaseLetter();
        assertTrue(asciival>=97&&asciival<=122);
    }
    // repeated test 15 times
    @RepeatedTest(value=15)
    public void testGetRandomUpperCaseLetter()
    {
        int asciival = rc.getRandomUpperCaseLetter();
        assertTrue(asciival>=65&&asciival<=90);
    }
    // repeated test 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomDigit()
    {
        int intval = rc.getRandomDigitCharacter();
        assertTrue(intval>=0 && intval<=9);
    }
    // repeated test 15 times
    @RepeatedTest(value=15)
    public void testGetRandomCharacter()
    {
        int asciival = rc.getRandomCharacter();
        assertTrue((asciival>=97&&asciival<=122)||(asciival>=65&&asciival<=90));
    }
    public void testIsPrime()
    {
        int intval = rc.getRandomDigitCharacter();
        boolean isPrime = true;
        for(int i = 0; i < intval; i++)
        {
            // if number is exactly divisble 
            if(intval%i==0)
            {
                isPrime = false;
                // check if results is true for false
                assertTrue(isPrime);
                return;
            }
        }
        // check if results if correct for true
        assertTrue(isPrime);
    }
        
}
