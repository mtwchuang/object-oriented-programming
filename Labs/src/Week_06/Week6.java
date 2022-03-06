package Week_06;
import java.util.*;
public class Week6 
{
    public void tutorialQ1()
    {
        int values[] = {3, 11, 1, 9, 7 ,5};
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for(int i = 0; i < values.length; i++)
        {
            l1 = addAndSort(l1, values[i]);
        }
        System.out.println(l1);
    }
    public LinkedList<Integer> addAndSort(LinkedList<Integer> inputlist, int inputvalue)
    {
        // assign an iterator to inputlist
        Iterator<Integer> iterator = inputlist.iterator();
        // variable to assign index for function add
        int index = 0;
        // Iteration tracking
        int prevNum = 0;
        int currNum = 0;
        // iterate through list
        while(iterator.hasNext())
        {
            currNum=iterator.next();
            // checks if inputvalue is between previous and current num
            // if it is sets index as same index as current num
            if(prevNum<inputvalue && currNum>=inputvalue)
            {
                index = inputlist.indexOf(currNum);
                break;
            }
            prevNum=currNum;
        }
        // catch if value is bigger than all current list numbers
        if(inputvalue>currNum)
        {
            index=inputlist.indexOf(currNum)+1;
        }
        inputlist.add(index, inputvalue);

        // the lazy way
        // inputlist.add(inputvalue);
        // Collections.sort(inputlist);
        return inputlist;
    }
    public void tutorialQ2()
    {
        int values[] = {3, 11, 1, 9, 7 ,5};
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for(int i = 0; i < values.length; i++)
        {
            l1 = addAndSort(l1, values[i]);
        }
        l1 = swapValues(l1,1,5);
        System.out.println(l1);
    }
    public LinkedList<Integer> swapValues(LinkedList<Integer> inputlist, int index1, int index2)
    {
        int temp1 = inputlist.get(index1);
        int temp2 = inputlist.get(index2);
        inputlist.set(index1, temp2);
        inputlist.set(index2, temp1);
        return inputlist;
    }
    public void tutorial03()
    {
        Random rand = new Random();
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        for(int i = 0; i<500;i++)
        {
            l1.add(rand.nextInt(1000,9999));
        }
        int value = rand.nextInt(1000,9999);
        System.out.println(findValue(l1, value));
    }
    public int findValue(LinkedList<Integer> inputlist, int searchvalue)
    {
        return inputlist.indexOf(searchvalue);
    }
    // Using HashMap is a bad idea because HashMap has no order
    // Hence a substitite was to try using a LinkedHashMap
    public void tutorial04()
    {
        int values[] = {3, 11, 1, 9, 7 ,5};
        LinkedHashMap<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>();
        for(int i = 0; i < values.length;i++)
        {
            hash = addAndSort(hash, values[i]);
        }
        System.out.println(hash);
    }
    public LinkedHashMap<Integer, Integer> addAndSort(LinkedHashMap<Integer,Integer> linkedhm, int value)
    {
        linkedhm.put(linkedhm.size(), value);
        // Collections.sort only compatible with Lists
        // Collections.sort(inputhash);
        boolean sorted = false;
        while(sorted==false)
        {
            sorted = true;
            for(int i = 0; i<linkedhm.size()-1;i++)
            {
                if(linkedhm.get(i)>linkedhm.get(i+1))
                {
                    linkedhm = swapValues(linkedhm, i, i+1);
                    sorted = false;
                }
            }
        }
        return linkedhm;
    }
    public LinkedHashMap<Integer, Integer> swapValues(LinkedHashMap<Integer, Integer> linkedhm, int index1, int index2)
    {
        int temp1 = linkedhm.get(index1);
        int temp2 = linkedhm.get(index2);
        linkedhm.put(index1, temp2);
        linkedhm.put(index2, temp1);
        return linkedhm;
    }
    public void tutorial05()
    {
        int values[] = {3, 11, 1, 9, 7 ,5};
        LinkedHashMap<Integer,Integer> hash = new LinkedHashMap<Integer,Integer>();
        for(int i = 0; i < values.length; i++)
        {
            hash = addAndSort(hash, values[i]);
        }
        hash = swapValues(hash,1,5);
        System.out.println(hash);     
    }
    public void tutorial06()
    {
        Random rand = new Random();
        LinkedHashMap<Integer,Integer> hash = new LinkedHashMap<Integer,Integer>();
        for(int i = 0; i<500;i++)
        {
            hash.put(hash.size(), rand.nextInt(1000,9999));
        }
        int value = rand.nextInt(1000,9999);
        if(hash.containsValue(value)==false)
        {
            System.out.println("-1");
        }
        else
        {
            for(int i = 0; i<hash.size();i++)
            {
                if(value==hash.get(i))
                {
                    System.out.println(i);
                }
            }
        }
    }

}
