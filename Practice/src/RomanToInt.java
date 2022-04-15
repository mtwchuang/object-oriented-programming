import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class RomanToInt 
{
    public int convertToInt(String romNum)
    {
        HashMap<String,Integer> romList = defineRomNum();
        String chkRomNum[] = checkRomNum(romNum);
        int result = 0;
        for(int i = 0; i < chkRomNum.length; i++)
        {
            if(romList.containsKey(chkRomNum[i]))
            {
                result+=romList.get(chkRomNum[i]);
            }
        }
        return result;  
    }

    public String[] checkRomNum(String romNum)
    {
        int numLeft  = romNum.length();
        char[] charRomNum = romNum.toCharArray();
        ArrayList<String> tempList = new ArrayList<String>();
        // check for numeric patterns
        int i = 0;
        while(i < numLeft)
        {
            if((numLeft-i)>1)
            {
                if(charRomNum[i]=='I'&&charRomNum[i+1]=='V')
                {
                    tempList.add("IV");
                    i+=2;
                }
                else if(charRomNum[i]=='I'&&charRomNum[i+1]=='X')
                {
                    tempList.add("IX");
                    i+=2;
                }
                else if(charRomNum[i]=='X'&&charRomNum[i+1]=='L')
                {
                    tempList.add("XL");
                    i+=2;
                }
                else if(charRomNum[i]=='X'&&charRomNum[i+1]=='C')
                {
                    tempList.add("XC");
                    i+=2;
                }
                else if(charRomNum[i]=='C'&&charRomNum[i+1]=='D')
                {
                    tempList.add("CD");
                    i+=2;
                }
                else if(charRomNum[i]=='C'&&charRomNum[i+1]=='M')
                {
                    tempList.add("CM");
                    i+=2;
                }
                else
                {
                    tempList.add(String.valueOf(charRomNum[i]));
                    i++;
                }
            }
            else
            {
                tempList.add(String.valueOf(charRomNum[i]));
                i++;
            }

        }
        String output[] = new String[tempList.size()];
        for(int j = 0; j < tempList.size(); j++)
        {
            output[j] = tempList.get(j);
        }
        return output;
    }

    public HashMap<String,Integer> defineRomNum()
    {
        HashMap<String, Integer> romList = new HashMap<String, Integer>();
        romList.put("I", 1);
        romList.put("V", 5);
        romList.put("X", 10);
        romList.put("L", 50);
        romList.put("C", 100);
        romList.put("D", 500);
        romList.put("M", 1000);
        romList.put("IV", 4);
        romList.put("IX", 9);
        romList.put("XL", 40);
        romList.put("XC", 90);
        romList.put("CD", 400);
        romList.put("CM", 900);
        return romList;
    }



    public static void main(String[] args)
    {
        RomanToInt r1 = new RomanToInt();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in your roman numeric: ");
        String romanNumeric = input.nextLine();
        System.out.println(r1.convertToInt(romanNumeric));
        input.close();
    }    
}
