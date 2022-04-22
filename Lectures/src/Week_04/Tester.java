package Week_04;
public class Tester 
{
    String name;
    Tester()
    {
        System.out.print("X");
    }
    private Tester(String name)
    {
        System.out.print("Z");
        name = name;
    }
}
