import java.util.Scanner;
public class Cryptography
{
  // Encryption method
  private static int encrypt(int num)
  {
    // Finding digits
    int digit1 = ((num/1000)+7)%10;
    int digit2 = (((num % 1000)/100) + 7)%10;
    int digit3 = (((num % 100)/10) + 7)%10;
    int digit4 = ((num % 10) + 7)%10;
    // Swapping by rearranging variables adding them
    int result = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
    return result;
  }
  // Decryption method
  private static int decrypt(int num)
  {
    // Finding digits
    int digit3 = ((num/1000)-7 + 10)%10;
    int digit4 = (((num % 1000)/100) -7 + 10)%10;
    int digit1 = (((num % 100)/10) -7 + 10)%10;
    int digit2 = ((num % 10) -7 + 10)%10;
    // Swapping by rearranging variables adding them
    int result = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
    return result;
  }
  public static void main(String[] args)
  {
    // Input four digit numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter four digits to be encrypted");
    int num = sc.nextInt();
    sc.close();
    // Parameter checking
    if(num < 0 && num >= 10000)
    {
      System.out.println("Number entered is out of bounds. Please try again");
      System.exit(0);
    }
    System.out.println("The number entered is "+num);
    
    // Encryption and Decryption function calling
    int encryptednum = encrypt(num);
    System.out.println("The encrypted number is "+encryptednum);
    int decryptednum = decrypt(encryptednum);
    System.out.println("The decrypted number is "+decryptednum);
  }
}