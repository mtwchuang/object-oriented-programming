import java.util.*;
public class Week6 
{
    public void tutorialQ1()
    {
        LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        l1 = addAndSort(l1,2);
        System.out.println(l1);
    }
    public LinkedList<Integer> addAndSort(LinkedList<Integer> inputlist, int inputvalue)
    {
        inputlist.add(inputvalue);
        Collections.sort(inputlist);
        return inputlist;
    }
    public void tutorialQ2()
    {
        LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        l1 = swapValues(l1,1,5);
        System.out.println(l1);
    }
    public LinkedList<Integer> swapValues(LinkedList<Integer> inputlist, int index1, int index2)
    {
        int temp = inputlist.set(index1,inputlist.get(index2));
        inputlist.set(index2, temp);
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


}
