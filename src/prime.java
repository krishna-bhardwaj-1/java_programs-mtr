import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check given number is prime or not: ");
        int a=sc.nextInt();
        int c=0;
        for(int i=2;i<=a/2;i++) {
            if(a%i==0){
                c++;break;
            }
        }
        if(c>0) System.out.println("Not prime");
        else System.out.println("prime");
    }
}
