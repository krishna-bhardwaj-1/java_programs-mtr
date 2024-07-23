package String_Buffer_class;
import java.lang.StringBuffer;
public class methods {
    public static void main(String[] args) {
        /*
        1). It present in java.lang package
        2). it is used to create mutable(modified) string in JAVA
        Methods for String Buffer Class:
        capacity(); append();   insert();   delete();   replace();  deleteCharAt();   setCharAt();
        reverse();  toString(); Length();   charAt();
        */
        //capacity
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.capacity());
        StringBuffer sb3 = new StringBuffer("10");
        System.out.println(sb3.capacity());
        //append
        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.append("JAVA");
        System.out.println(sb4);
        //insert
        StringBuffer sb5 = new StringBuffer("Hello");
        sb5.insert(0,"JAVA");
        System.out.println(sb5);
        //reverse
        StringBuffer sb6= new StringBuffer("Krishna Bhardwaj");
        System.out.println(sb6.reverse());
        //length
        System.out.println(sb6.length());
        //charAt
        System.out.println(sb6.charAt(0));
        //delete charAt
        System.out.println(sb6.deleteCharAt(0));
        //set charAt
        StringBuffer sb7 = new StringBuffer("Hello");
        sb7.setCharAt(1,'p');
        System.out.println(sb7);
        //delete
        sb7.delete(1,4);
        System.out.println(sb7);
        //replace
        StringBuffer sb8 = new StringBuffer("WELCOME");
        sb8.replace(1,4,"JAVA");
        System.out.println(sb8);
        //toString
        String p=sb8.toString();
        System.out.println(sb8);
    }
}
