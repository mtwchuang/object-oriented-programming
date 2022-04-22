package ClassTest_02.Question_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BankAdjustments 
{
    public ArrayList<String> readAndAdjust(String inputFile) throws IOException
    {
        ArrayList<String> tempList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while((line = br.readLine())!=null)
        {
            try
            {
                int adjustValue = Integer.parseInt(line)+100;
                String strValue = ""+adjustValue;
                tempList.add(strValue);    
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
                tempList.add("Exception");
            }
        }

        br.close();
        return tempList;
    }

    public void writeValue(ArrayList<String> tempList, String destFile) throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));
        for(int i = 0; i < tempList.size(); i++)
        {
            bw.write(tempList.get(i)+"\n");
        }
        bw.close();
    }
    public static void main(String[] args) throws IOException
    {
        BankAdjustments ba = new BankAdjustments();
        String fileSrc = "C:\\Users\\USER\\Documents\\GitHub\\object-oriented-programming\\Test\\src\\ClassTest_02\\Question_02\\BankRecords.txt";
        String fileDst = "C:\\Users\\USER\\Documents\\GitHub\\object-oriented-programming\\Test\\src\\ClassTest_02\\Question_02\\BankUpdatedRecords.txt";
        ArrayList<String> test = ba.readAndAdjust(fileSrc);
        ba.writeValue(test, fileDst);

    }
}
