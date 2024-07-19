package numbers;

import java.util.Scanner;

//A number is called Disarium if sum of its digits powered with their respective positions is equal to the number itself.
public class desarium_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check given number is desarium or not: ");
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
