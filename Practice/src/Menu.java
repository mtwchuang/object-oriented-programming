import java.util.Scanner;
public class Menu
{
    public static void main(String[] args)
    {
        System.out.println("Main Menu\n-----------\n1.  Personal Account\n2.  Corporate Account\n3.  Quit\n\n");
        System.out.println("Enter option: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();
        if(choice > 5)
        {
            System.out.println("The numbered entered is invalid. Please try again");
            System.exit(0);
        }
        switch(choice)
        {
            case 1:
            {
                System.out.println("\n\nPersonal Account Submenu\n-----------\n1.  Check Account Balance\n2.  Perform Fund Transfer\n3.  Perform Bill Payment\n4.  Quit\n\n");
                System.out.println("Enter option: ");
                break;
            }
            case 2:
            {
                System.out.println("\n\nPersonal Account Submenu\n-----------\n1.  Check Account Balance\n2.  Perform Fund Transfer\n3.  Perform Bill Payment\n4.  Quit\n\n");
                System.out.println("Enter option: ");
                break;
            }
            case 3:
            {
                System.out.println("\n\nThank you have a nice day!");
                System.exit(0);
            }
            case 4:
            {
                System.out.println("\n\nMain Menu\n-----------\n1.  Personal Account\n2.  Corporate Account\n3.  Quit\n\n");
                System.out.println("Enter option: ");
            }
        }

    }
}
