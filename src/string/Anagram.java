package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        System.out.println("Enter second string to check anagrams: ");
        String b = sc.nextLine();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.compare(ch1,ch2)==0) System.out.println("Anagram String.");
        else System.out.println("Not Anagram String");
    }
}
