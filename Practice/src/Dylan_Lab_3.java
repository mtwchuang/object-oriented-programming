import java.util.Scanner;
class PetrolPurchase
{
    private String station;
    private double quantity;
    private String type;
    private double price;
    private int discount;

    // Constructors
    public PetrolPurchase()
    {

    }
    public PetrolPurchase(String s, double q, String t, double p, int d)
    {
        setInfo(s,q,t,p,d);
    }
    public PetrolPurchase(PetrolPurchase pp)
    {
        setInfo(pp.station,pp.quantity,pp.type,pp.price,pp.discount);
    }
    
    // Getter and Setter
    public String getStation() 
    {
        return this.station;
    }
    public double getQuantity() 
    {
        return this.quantity;
    }
    public String getType() 
    {
        return this.type;
    }
    public double getPrice() 
    {
        return this.price;
    }    
    public int getDiscount() 
    {
        return this.discount;
    }   
    public void setStation(String station) 
    {
        this.station = station;
    }
    public void setQuantity(double quantity)
    {
        this.quantity = quantity;
    }
    public void setType(String type) 
    {
        this.type = type;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
    public void setDiscount(int discount) 
    {
        this.discount = discount;
    }
    
    public void setInfo(String s, double q, String t, double p, int d)
    {
        this.station=s;
        this.quantity=q;
        this.type=t;
        this.price=p;
        this.discount=d;
    }
    public double computePayment()
    {
        return (price*quantity)*(1-discount/100);
    }
    public double getPayment()
    {
        return computePayment();
    }
    public void printInfo()
    {
        System.out.printf("\nStation: "+this.station);
        System.out.printf("\nTotal litre: "+this.quantity);
        System.out.printf("\nPetrol type: "+this.type);
        System.out.printf("\nPrice per litre: "+this.price);
        System.out.printf("\nActual cost: %.2f",quantity*price);
        System.out.printf("\nDiscount ("+discount+"): %.2f",(quantity*price*discount)/100);
        System.out.printf("\nAmount to pay: %.2f",getPayment());
    }

}
class Dylan_Lab_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the station: ");
        String inputstation = input.nextLine();
        System.out.printf("Enter quantity in litre: ");
        double inputquantity = input.nextDouble();
        input.nextLine();
        System.out.printf("Enter type of petrol: ");
        String inputtype = input.nextLine();
        System.out.printf("Enter price of petrol: ");
        double inputprice = input.nextDouble();
        System.out.printf("Enter discount: ");
        int inputdiscount = input.nextInt();
        PetrolPurchase pp1 = new PetrolPurchase(inputstation,inputquantity,inputtype,inputprice,inputdiscount);
        System.out.printf("\nSummary of your purchase\n");
        pp1.printInfo();

        System.out.printf("\n\nEnter additional quantity of petrol: ");
        double additionpetrol = input.nextDouble();
        pp1.setQuantity(pp1.getQuantity()+additionpetrol);
        System.out.printf("\n\nYour new purhcased price");
        pp1.printInfo();

        PetrolPurchase pp2 = new PetrolPurchase(pp1);
        System.out.println("\nDuplicate the same object");
        pp2.printInfo();
        input.close();
    }
}