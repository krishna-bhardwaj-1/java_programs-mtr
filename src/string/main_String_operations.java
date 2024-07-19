package string;

public class main_String_operations {
    public static void main(String[] args) {
        String a="CALIFORNIA";

        //index of
        System.out.println(a.indexOf('I')+1);
        //last index of
        System.out.println(a.lastIndexOf('I')+1);
        //starts with
        String b="WELCOME";
        System.out.println(b.startsWith("WEL"));
        // ends with
        System.out.println(b.endsWith("OME"));
        //equals
        System.out.println(a.equals(b));
        String c =new String("CALIFORNIA");
        System.out.println(a.equals(c));
        String d = "california";
        //equal ignore case
        System.out.println(a.equalsIgnoreCase(d));
        //concatenation
        System.out.println(a.concat(b));
        //compare_To
        String p = "A";
        String q = "a";
        String m = "B";
        System.out.println(p.compareTo(q));
        //compare to ignore case
        System.out.println(p.compareToIgnoreCase(q));
        System.out.println(p.compareTo(m));
        System.out.println(q.compareToIgnoreCase(m));
        System.out.println(q.compareTo(p));
        // Trim: Remove spaces from left and right
        String str = "        Krishna   Bhardwaj      ";
        System.out.println(str.trim());
        //substring
        String ch = "GLAUNIVERSITY";
        System.out.println(ch.substring(0,4));
        //Replace a char in a string
        System.out.println(ch.replace('A','B'));
        //To char array
        char[] kr =ch.toCharArray();
        for(char i:kr)
            System.out.println(i);
    }
}
