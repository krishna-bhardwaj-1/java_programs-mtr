package array;

import java.util.Scanner;

public class number_20_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[] a = new int[20];
        for(int i=0;i<20;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<20;i++)
            sum+=a[i];
        System.out.println("Sum of guven two numbers are: "+sum);
    }
}
