package forloop;

public class pattern2 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=5;i++) {
            System.out.println(a*i);
            a = a * 10 + 1;
        }
    }
}
