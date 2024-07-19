package string;

import java.util.Scanner;
public class patterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p = sc.nextLine();
        for(int i=p.length()-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(p.charAt(j));
            }
            System.out.println();
        }
    }
}
