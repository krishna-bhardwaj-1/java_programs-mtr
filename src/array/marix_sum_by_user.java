package array;

import java.util.Scanner;

public class marix_sum_by_user {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows in a matrix:");
        int r=sc.nextInt();
        System.out.print("Enter columns in a matrix:");
        int c=sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix form: ");
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
                sum+=a[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of the all elements by you: "+sum);
    }
}
