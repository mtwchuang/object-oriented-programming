package Week_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListPractice 
{
    public ArrayList<Integer> addAndSort(ArrayList<Integer> inputArray, int val)
    {
        inputArray.add(val);
        Collections.sort(inputArray);
        return inputArray;
    }
    public void Question1()
    {
        Scanner sc = new Scanner(System.in);
        int sortedArray[] = {1,3,5,7,9,11};
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i = 0; i < sortedArray.length; i++)
        {
            a1 = addAndSort(a1, sortedArray[i]);
        }
        while(true)
        {
            try
            {
                System.out.println("Enter in input value: ");
                int input = sc.nextInt();
                a1 = addAndSort(a1,input);
                break;
            }
            catch(InputMismatchException ime)
            {
                System.out.println("Retrying, exception encountered "+ime);
                sc.next();
            }
        }
        System.out.println(a1);
        sc.close();
    }
    public static void main(String[] args)
    {
        ArrayListPractice test2 = new ArrayListPractice();
        test2.Question1();
    }    
}
