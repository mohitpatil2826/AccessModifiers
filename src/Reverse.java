import java.util.Scanner;

public class Reverse
{
 public static void main(String[] args)
 {
     System.out.println("Enter the number to perform reverse opration");
     Scanner s= new Scanner(System.in);
        int number = s.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
     System.out.println("REVERSE NUMBER IS :" +reverse);

    }
}




