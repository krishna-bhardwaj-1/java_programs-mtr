package String_Buffer_class;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String p =sc.nextLine();
        StringBuffer sb = new StringBuffer(p);
        sb.reverse();
        String r=sb.toString();
        String st =(p.equals(r))?"palindrome":"not palindrome";
        System.out.println(st);
    }
}
