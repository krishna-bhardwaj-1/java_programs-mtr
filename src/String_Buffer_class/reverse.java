package String_Buffer_class;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String p=sc.nextLine();
        StringBuffer sb = new StringBuffer(p);
        sb.reverse();
        System.out.println("Reverse of the string: "+sb);
    }
}
