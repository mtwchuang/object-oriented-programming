package Week_06;
import java.util.ArrayList;
public class ArrayListDemo 
{
    public static void main(String[] args)
    {
        String test[] = {"A","B","C"};
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        for(int i = 0; i < test.length; i++)
        {
            a1.add(test[i]);
            a2.add(test[i]);
        }
        a1.addAll(a2);
        System.out.println(a1.size());
        System.out.println(a1);

        a1.get(0);
        a1.remove("A");
        System.out.println(a1);

        System.out.println(a1.contains("A"));
    }
}
    /* Key Takeaways for Arraylist*/
    // Add values using .add()
        // Can specify where to add element with index add(index, value)
        // Can extend a collection with addAll()
        //
    // Read values with index using .get()
    // Remove values using .remove()
    
    // Check if value is contained with .contains()
    // Check size using .size()
    // clear all elements .clear()
    // check if empty isEmpty()


