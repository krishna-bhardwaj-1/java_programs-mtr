package oops;

public class datamember {
    String N;
    int a;
    void disp(){
        System.out.println(N+" "+a);
    }
}
/* These are the default values of the data member of a class :-
            byte    0
            short   0
            int     0
            long    0
            float   0.0f
            double  0.01
            boolean     false
            char    \000 ->   
            String  Null
 */
class datamember_defaultvalue{
    public static void main(String[] args) {
        datamember obj = new datamember();
        obj.disp();
        System.out.println('\000');
    }
}

