package forloop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter a no. to find the factorial: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=1;
        for(int i=a;i>=1;i--){
            f=f*i;}
        System.out.println("factorial of the given number is: "+f);
    }

}
