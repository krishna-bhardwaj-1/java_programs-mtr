package string;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p = sc.nextLine();
        for(int i=p.length()-1;i>=0;i--)
            System.out.print(p.charAt(i));
    }
}
