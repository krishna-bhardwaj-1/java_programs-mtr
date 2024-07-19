import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms: ");
        int a=sc.nextInt();
        int i,j;
        for(i=1,j=2;i<=a;i++,j++){
            System.out.print(i+"/"+j);
            if(i<a) System.out.print(" + ");
        }
    }
}
