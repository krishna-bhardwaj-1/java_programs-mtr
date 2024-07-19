package array;

import java.util.Scanner;

public class transpose {
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
        System.out.println("Original Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transposed Matrix: ");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

