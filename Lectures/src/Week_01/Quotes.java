package Week_01;
public class Quotes 
{
    public static void main(String[] args)
    {
        System.out.println("A quote by Aristole:");
        System.out.print("The roots of education are bitter");
        System.out.print("but the fruits are sweets");
        System.out.println(""); 
        System.out.println(""); 
        System.out.print("A quote by Thomas Szasz: ");
        System.out.print(2+" wrongs don't make a right, but "+"they make a good excuse.");

        int i = (int) 1.345;
        System.out.println("\n\n"+i);
        byte y = (byte) i;
        System.out.println(y);
        long l = i;
        System.out.println(l);
        float f = l;
        System.out.println(f+"\n\n");

        int counter = 0;
        // while(counter<5)
        // {
        //     System.out.println(counter);
        //     counter++;
        // }
        do
        {
            System.out.println(counter);
            counter--;
        }while(counter>0);
    }
}
