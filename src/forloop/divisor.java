package forloop;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding the factor: ");
        int a=sc.nextInt();
        System.out.print("Factors of the given number is: ");
        for(int i=1;i<=a/2;i++){
            if(a%i==0) System.out.print(i+" ");
        }
    }
}
