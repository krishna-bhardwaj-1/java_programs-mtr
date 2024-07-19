package string;

import java.util.Scanner;

public class patterns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p = sc.nextLine();
        for(int i=0;i<p.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(p.charAt(j));
            }
            System.out.println();
        }
    }
}
