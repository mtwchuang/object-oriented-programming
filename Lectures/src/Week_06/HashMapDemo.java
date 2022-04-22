package Week_06;
import java.util.HashMap;
public class HashMapDemo 
{

    public static void main(String[] args)
    {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("CSC3002","Intgerated Work Study Programme");
        hmap.put("CSC3007","Information Visualisation");
        hmap.put("CSC3009","Machine Learning");

        System.out.println("Key: "+hmap.keySet());
        System.out.println("Values: "+hmap.values());
        System.out.println("Size: "+hmap.size());

        System.out.println(hmap.get("CSC3007"));
        System.out.println(hmap.containsKey("CSC3007"));
        hmap.remove("CSC3007");
        System.out.println(hmap.containsValue("Information Visualisation"));

        System.out.println("Contents after deletion: "+hmap);
        System.out.println("Size after deletion: "+hmap.size());

        hmap.clear();
        System.out.println(hmap.isEmpty());
    }
}
    /* Key Takeaways for HashMap*/
    // Add key-value pairs with .put()
    // Remove key-value pair with .remove()
    // Reads values using keys with .get()

    // Checks if key exists with .containsKey()
    // Check if value exists with .containsValue()

    // Gets number of pairs with .size()
    // Get keys with .keySet()
    // Get values with .values()

    // Remove all elements with .clear()
    // Check if empty .isEmpty()
