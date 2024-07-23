package String_builder_class;

import java.util.Scanner;

public class newstring_swap1stlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p=sc.nextLine();
        String r= (p.charAt(p.length()-1)+p.substring(1,p.length()-1)+p.charAt(0));
        System.out.println(r);
    }
}
