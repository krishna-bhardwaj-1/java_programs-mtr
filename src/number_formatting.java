import java.util.*;

public class number_formatting {
    public static void main(String[] args) {
        System.out.printf("simple integer: %d%n",10000l);
        System.out.printf(Locale.US,"%,d%n",1000000000);
        System.out.printf(Locale.ITALY,"%,d%n",1000000000);
        //float and double formatting
        System.out.printf("%f%n",5.1473);
        System.out.printf("'%5.2f'%n",5.1437);
        System.out.printf("'%10.3E'%n",5.1473);
        //Date and time formatting
        Date date=new Date();
        System.out.printf("%tT%n",date);
        //System.out.printf("hours %t H:minutes %t M: seconds %t%n",date,date,date);
    }
}
