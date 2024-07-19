package numbers;
//145=1!+4!+5! = 1+24+120 = 145
public class strong_number_1_500 {
    public static void main(String[] args) {
        for(int d=1;d<500;d++) {
            int a = d;
            int sum = 0;
            int b = a;
            while (a > 0) {
                int f = 1;
                int c = a % 10;
                a = a / 10;
                for (int i = c; i >= 1; i--)
                    f = f * i;
                sum += f;
            }
            if (sum == b) System.out.println(b);
        }
    }
}
