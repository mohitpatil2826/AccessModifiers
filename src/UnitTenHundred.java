import java.util.Scanner;

public class UnitTenHundred {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(number==1)
        {
            System.out.println("Number is Unit");
        }
        else if(number==10)
        {
            System.out.println("Number is Ten");
        }
        else if(number==100)
        {
            System.out.println("Number is Hundred");
        }
        else System.out.println("Try again");
    }
}
