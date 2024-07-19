package array;

import java.util.Scanner;

public class matrix_equal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows in a matrix:");
        int r=sc.nextInt();
        System.out.print("Enter columns in a matrix:");
        int c=sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        System.out.println("Enter values in the first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values in the second matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrices are: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second one: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int p=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=b[i][j]){
                    p=1;break;
                }
            }
        }
        if(p==0) System.out.println("Matrix are equal");
        else System.out.println("matrix are not equal");
    }
}
