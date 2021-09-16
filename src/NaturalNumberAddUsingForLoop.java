import java.util.Scanner;

public class NaturalNumberAddUsingForLoop {

    public static void main(String[] args) {
        System.out.println("entrer limit");

        Scanner s = new Scanner(System.in);
        int num=s.nextInt();

        int sum =0;
       for(int i =1;i<=num;)
        {

            sum = sum + i;
            i++;

        }
        System.out.println(sum);
    }
}
