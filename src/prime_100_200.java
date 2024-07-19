public class prime_100_200 {
    public static void main(String[] args) {
        for(int a=100;a<=200;a++){
            int c=0;
            for(int i=2;i<a/2;i++){
                if(a%i==0){ c++;break;}
            }
            if(c==0) System.out.print(a+" ");
        }
    }
}
