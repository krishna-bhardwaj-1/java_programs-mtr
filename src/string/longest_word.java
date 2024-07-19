package string;

import java.util.Scanner;

public class longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int m=0;
        String t =" ";
        for(String c: b){
            if(c.length()>m){
                m=c.length();
                t=c;
            }
        }
        System.out.println("Longest word: "+t);
        System.out.println("Length: "+m);
    }
}
