package Week_06;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
public class LinkedListPractice 
{
    Scanner sc = null;
    Random rand = null;
    public void setup()
    {
        System.out.println("Setting up");
        sc = new Scanner(System.in);
        rand = new Random();
    }
    public LinkedList<Integer> addAndSort(LinkedList<Integer> list, int inputNum)
    {
        list.add(inputNum);
        Collections.sort(list);
        return list;
    }
    public LinkedList<Integer> swapValues(LinkedList<Integer> inputList, int idx1, int idx2) throws IndexOutOfBoundsException
    {
        if(idx1 >= inputList.size()||idx2 >= inputList.size())
        {
            throw new IndexOutOfBoundsException();
        }
        int val1 = inputList.get(idx1);
        int val2 = inputList.get(idx2);
        inputList.set(idx1, val2);
        inputList.set(idx2, val1);
        return inputList;
    }
    public void Question()
    {
        int sortedList[] = {1,3,5,7,9,11};
        LinkedList<Integer> l1  = new LinkedList<Integer>();
        for(int i = 0; i < sortedList.length; i++)
        {
            l1 = addAndSort(l1, sortedList[i]);
        }
        // input to add element to linkedlist
        while(true)
        {
            try
            {
                System.out.print("Enter in integer to add to LinkedList: ");
                int inputNum = sc.nextInt();
                l1 = addAndSort(l1,inputNum);
                break;
            }
            catch(InputMismatchException ime)
            {
                System.out.println("Exception occured, retry "+ime);
                sc.next();
            }
        }
        System.out.println(l1);
        // input to select indexes to swap
        while(true)
        {
            try
            {
                System.out.println("Enter the first index: ");
                int idx1 = sc.nextInt();
                System.out.println("Enter the second index: ");
                int idx2 = sc.nextInt();
                l1 =  swapValues(l1, idx1, idx2);
                break;
            }
            catch(InputMismatchException nme)
            {
                System.out.println("Retrying, Exception encountered "+nme);
                sc.nextInt();
            }
            catch(IndexOutOfBoundsException oob)
            {
                System.out.println("Retrying, Exception encountered "+oob);
            }
        }
        System.out.println(l1);
    }
    public void Question2()
    {
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        for(int i = 0; i < 50; i++)
        {
            l2.add(rand.nextInt(0,100));
        }
        System.out.println(l2);
        int checkVal = rand.nextInt(0,100);
        System.out.println("The statement that the list contains "+checkVal+" is "+l2.contains(checkVal));
    }
    public void cleanup()
    {
        System.out.println("Cleaning up");
        if(sc!=null)
        {
            sc.close();
        }
        if(rand!=null)
        {
            rand=null;
        }
    }
    public static void main(String[] args)
    {
        LinkedListPractice test = new LinkedListPractice();
        test.setup();
        test.Question();
        test.Question2();
        test.cleanup();
        
    }
}
