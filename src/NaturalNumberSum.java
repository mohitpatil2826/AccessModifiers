import java.util.Scanner;

public class NaturalNumberSum

{


    public static void main(String[] args) {
        System.out.println("Enter the natural numberr limit ");
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int i =1;
        int sum =0;
        while(i <=num)
        {

            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
