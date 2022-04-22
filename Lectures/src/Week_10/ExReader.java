package Week_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ExReader 
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader in = null;
        try
        {
            URL oracle = new URL("http://www.oracle.com/");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        String inputLine;
        while((inputLine = in.readLine())!=null)
        {
            System.out.println(inputLine);
        }
        in.close();
    }    
}
