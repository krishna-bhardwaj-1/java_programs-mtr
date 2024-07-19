package string;

import java.util.Scanner;

public class angram_wtut_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        //char[] temp = new char[20];
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
//        for(int i=0;i<a.length();i++){
//            int c=0;
//
//            for(int j=0;j<a.length();j++){
//                if(ch1[i]==ch1[j]) c++;
//            }
//            System.out.println("Count of "+ch1[i]+" "+c);
//        }
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    i++;
                    ch2[j]='0';
                    j=0;
                    if(j==ch2.length)
                        System.out.println("Not anagrams");
                    break;
                }
            }
        }
        System.out.printf("Anagrams");
    }
}
