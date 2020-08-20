
import java.util.Scanner;

public class SquareANumber
{
  public static void main (String[] args)
  {
    Scanner num = new Scanner(System.in);
    
    double number;
    double squarednumber;
    
    System.out.println("Enter the number that you want to square: "); 
    number = num.nextInt();
    
    squarednumber = Math.pow(number,2); 
    
    System.out.println(squarednumber + " is the result of " + number + " squared.");
  }
}
  