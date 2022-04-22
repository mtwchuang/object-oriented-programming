package Week_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileIO 
{
    public static void main(String[] args)
    {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\Documents\\GitHub\\object-oriented-programming\\Lectures\\src\\Test.txt")))
        {
            System.out.println(br.readLine());
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
