package numbers;
import java.util.Scanner;
//145=1!+4!+5! = 1+24+120 = 145
public class strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check given number is strong or not: ");
        int a = sc.nextInt();
        int sum = 0;
        int b=a;
        while (a > 0) {
            int f = 1;
            int c = a % 10;
            a = a / 10;
            for (int i = c; i >= 1; i--)
                f = f * i;
            //System.out.println(c);
            //System.out.println(f);
            sum += f;
            //System.out.println(sum);
        }
//        System.out.println(sum);
//        System.out.println(b);
//        System.out.println(a);

        if (sum == b) System.out.println("Strong");
        else System.out.println("Not strong");
    }
}

