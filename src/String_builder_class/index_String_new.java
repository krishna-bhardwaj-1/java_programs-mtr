package String_builder_class;

import java.util.Scanner;

public class index_String_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a=sc.nextLine();
        System.out.print("Enter second string: ");
        String b=sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<a.length()||i<b.length();i++){
            if(i<a.length()) sb.append(a.charAt(i));
            if(i<b.length()) sb.append(b.charAt(i));
        }
        System.out.println(sb);
    }
}
