package string;

import java.util.Scanner;

public class search_word_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p =sc.nextLine();
        int c=0;
        String[] w = p.split(" ");
        for(String s:w){
            if(s.equals("is")) c++;
        }
        System.out.println(c);
    }
}
