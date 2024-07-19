package string;

public class string_literals {
    public static void main(String[] args) {
        String a = "Ram";
        String b = a;
        String c = "abcde";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println();
        String d = new String("Ram");
        String e = new String("Ram");
        System.out.println(d==e);
        System.out.println(d.equals(e));
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        a="shyam";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}
