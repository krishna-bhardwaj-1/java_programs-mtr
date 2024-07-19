import java.util.Scanner;

public class series3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms: ");
        int a=sc.nextInt();
        int b=1;
        for(int i=0;i<a;i++){
            if(b%2==0) System.out.print("-"+b+" ");
            else System.out.print(b+" ");
            b+=3;
        }
    }
}
