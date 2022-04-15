package Week_09;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
public class RandomCharacterTest 
{
    RandomCharacter rc = new RandomCharacter();
    // repeated test 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomLowerCaseLetter()
    {
        int asciival = rc.getRandomLowerCaseLetter();
        // checks if character is between ascii 97 and 122 meaning lowercase alphabet
        assertTrue(asciival>=97&&asciival<=122);
    }
    // repeated test 15 times
    @RepeatedTest(value=15)
    public void testGetRandomUpperCaseLetter()
    {
        int asciival = rc.getRandomUpperCaseLetter();
        // checks if character is between ascii 65 and 90 meaning uppercase alphabet
        assertTrue(asciival>=65&&asciival<=90);
    }
    // repeated test 15 times
    @RepeatedTest(value = 15)
    public void testGetRandomDigit()
    {
        int intval = rc.getRandomDigitCharacter();
        // checks if digit is between 0 and 9
        assertTrue(intval>=0 && intval<=9);
    }
    // repeated test 15 times
    @RepeatedTest(value=15)
    public void testGetRandomCharacter()
    {
        int asciival = rc.getRandomCharacter();
        // checks if character is a uppercase or lowercase alphabet
        assertTrue((asciival>=97&&asciival<=122)||(asciival>=65&&asciival<=90));
    }
    @Test
    // test if number is prime
    public void testIsPrime()
    {
        int intval = rc.getRandomDigitCharacter();
        System.out.println("Random digit "+intval);
        boolean isPrime = true;
        if(intval >2)
        {
            for(int i = 2; i < intval; i++)
            {
                // if number is exactly divisable by any number > 2 aside from itself
                if(intval%i==0)
                {
                    // number is not prime
                    isPrime = false;
                    assertFalse(isPrime);
                    System.out.println("Is number a prime "+isPrime);
                    return;
                }
                // else number is prime
            }
        }
        // numbers 0 or 1 are not prime numbers
        if(intval==0 || intval==1)
        {
            isPrime = false;
            assertFalse(isPrime);
            System.out.println("Is number a prime: "+isPrime);
            return;
        }
        // check if results if correct for true
        assertTrue(isPrime);
        System.out.println("Is number a prime: "+isPrime);
    }
        
}
