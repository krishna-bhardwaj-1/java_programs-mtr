package Array_Class;

import java.util.Scanner;

public class longest_word {
    public static void main(String[] args) {
        System.out.print("Enter a paragraph for finding the longest word within it.: ");
        Scanner sc = new Scanner(System.in);
        String p=sc.nextLine();
        int m=0;
        String t="";
        String[] w=p.split(" ");
        for(String b:w){
            if(b.length()>m)
            {
                m=b.length();
                t=b;
            }
        }
        System.out.println("longest word: "+t);
        System.out.println("its length is "+m);
    }
}
