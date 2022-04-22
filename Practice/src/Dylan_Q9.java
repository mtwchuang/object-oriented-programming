import java.util.Random;
public class Dylan_Q9
{
    // Find largest index for input numarrya
    public static int findLargest(int[] numarray)
    {
        int largest = 0, largestindex = 0;
        for(int i = 0; i < numarray.length; i++)
        {
            if(largest<=numarray[i])
            {
                largest=numarray[i];
                largestindex=i;
            }
        }
        return largestindex;
    }
    public static void main(String[] args)
    {
        // Random numbers input for numarray
        Random rand = new Random();
        int[] inputarray = new int[5];
        for(int i = 0; i<inputarray.length; i++)
        {
            inputarray[i] = rand.nextInt(10,100);
            System.out.println(inputarray[i]); 
        }

        System.out.println("Index of biggest number within array is "+findLargest(inputarray));
    }
}
