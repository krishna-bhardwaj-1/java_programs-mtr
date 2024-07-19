package operators;
import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two no. for comparison: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String p = (a==b)?"Equal no.":"Not Equal no.";
        System.out.println(p);
        int num=1020;
        String q=(num==100)?"yes":"no";
        System.out.println(q);
    }
}
