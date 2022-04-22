package Week_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO 
{
    public static void main(String[] args) throws IOException
    {
        String inputString = new String();
        while(true)
        {
            try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in)))
            {
                System.out.print("How many total miles did you run: ");
                inputString = input.readLine();
    
                int iMiles = Integer.parseInt(inputString);
                System.out.println("So you ran "+iMiles+" miles!");
                double dMiles = Double.parseDouble(inputString);
                System.out.println("So you ran "+dMiles+" miles!");
                break;
            }
            catch(IOException io)
            {
                System.out.println("Exception encountered, try again: "+io);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("Exception encountered, try again: "+nfe);
            }
        }
    }
}
