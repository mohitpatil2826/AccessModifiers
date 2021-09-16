import java.util.Scanner;

public class PalindromeUsingForLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number to perform reverse opration");
        Scanner s= new Scanner(System.in);
        int number = s.nextInt();
        int reverse = 0;
        for(int i =0;i<5;i++)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("REVERSE NUMBER IS :" +reverse);



        if(number==reverse){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not palindrome nnumber");
        }
    }
}
