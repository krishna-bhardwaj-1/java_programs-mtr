package numbers;
//19 = 1^2+9^2=1+81=82
//82=8^2+2^2=64+4=68
//68=6^2+8^2=36+64=100
//100=1^2+0^2+0^2=1
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happy_number {
    public static boolean isHappy(int a){
        Set<Integer> set = new HashSet<>();
        while(a!=1 && !set.contains(a)){
            set.add(a);
            a=getNext(a);}
        return a==1;
    }
    public static int getNext(int a) {
        int sum=0;
        while(a>0){
            int c=a%10;
            sum+=c*c;
            c/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check given number is happy or not: ");
        int a=sc.nextInt();
        if(isHappy(a)) System.out.println(a+"happy number");
        else System.out.println(a+"not a happy number.");
    }
}
