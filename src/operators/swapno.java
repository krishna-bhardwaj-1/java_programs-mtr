package operators;

import java.util.Scanner;

public class swapno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two no. for swapping: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // By using the third variable
//        int c=a;
//        a=b;
//        b=c;
        //Without using the third variable
//        a=a+b;
//        b=a-b;
//        a=a-b;
        //without using any airthmetic operator
//        a=a^b;
//        b=a^b;
//        a=a^b;
        //without using third variable in a single line
         a=a+b-(b=a);
        System.out.println(a+" "+b);
    }
}
