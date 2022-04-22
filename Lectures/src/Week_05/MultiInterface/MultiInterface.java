package Lectures.Week_5.MultiInterface;
public class MultiInterface implements TriInterface{
// public class MultiInterface implements I1, I2, I3{
    @Override
    public void show(int i) {
        System.out.print(i+" from Inter1, ");
        
    }

    @Override
    public void show2(int j) {
        System.out.print(j+" from Inter2, and ");
        
    }

    @Override
    public void show3(int k) {
        System.out.print(k+" from Inter3 = ");
        
    }

    @Override
    public int showSum() {
        return one+two+three;
    }

    public static void main(String[] args)
    {
        MultiInterface m1 = new MultiInterface();
        System.out.println("The sum of ");
        m1.show(one);
        m1.show2(two);
        m1.show3(three);
        System.out.println(m1.showSum());
    }
}
