import java.util.Scanner;

public class MinMaxEqu {
    public static void main(String[] args) {
//        i) a+b*c ii) c+a/b
////        iii) a%b+c iV) a*b+c


        Scanner s = new Scanner(System.in);
        System.out.println("enter the4 value of a b c");

        int a =s.nextInt();
        System.out.println("value of a" +a);
                int b=s.nextInt();
        System.out.println("value of a" +b);

        int c=s.nextInt();
        System.out.println("value of a" +c);
        int res1 = a + b*+c;
        int res2 = c + a / b;
        int res3 = a % b + c;
        System.out.println("res1 :" +res1);
        System.out.println("res1 :" +res2);
        System.out.println("res1 :" +res3);
        if(res1>res2 && res1 > res3)
        {

            System.out.println("res 1 is max"+res1);
        }
        else if(res2 > res1 && res2 > res3)
        {
            System.out.println("res 2 is max");
        }
        else{
            System.out.println("res 3 is min");
        }
    }
}
