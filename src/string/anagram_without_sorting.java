package string;
import java.util.Scanner;
public class anagram_without_sorting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        String b = sc.nextLine();
        if(a.length()!=b.length()) System.out.println("Not anagram.");
        int[] arr=new int[26];
        for(int i=0;i<a.length();i++){
            int c = a.charAt(i)-97;
            //System.out.println("c = "+c);
            arr[c]++;
        }
//        for(int i:arr){
//            System.out.println(i);
//        }
        for(int i=0;i<b.length();i++){
            int c=b.charAt(i)-97;
            //System.out.println("c ="+c);
            arr[c]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) System.out.println("Not anagram");
        }
        System.out.println("Anagram");
    }
}
