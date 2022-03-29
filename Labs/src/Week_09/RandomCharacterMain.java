package Week_09;

public class RandomCharacterMain 
{
    public static void main(String [] args)
    {
        RandomCharacter rc = new RandomCharacter();
        System.out.println("Random lowercase letter: "+rc.getRandomLowerCaseLetter());
        System.out.println("Random uppercase letter: "+rc.getRandomUpperCaseLetter());
        System.out.println("Random digits 0-9: "+rc.getRandomDigitCharacter());
        System.out.println("Random letter: "+rc.getRandomCharacter());
        RandomCharacterTest rct = new RandomCharacterTest();
        rct.testIsPrime();
    }
}
