package Array_Class;

import java.util.Arrays;

public class some_Functions {
    public static void main(String[] args) {
        //it present in java.util package
        //it contains function that work on array
        //sort();   compare();  binarysearch();
        int [] a = {5,2,4,6,1,7};
        Arrays.sort(a);
        for(int b:a)
            System.out.print(b+" ");
        System.out.println();
        int r = Arrays.binarySearch(a,1);
        System.out.println(r);
    }
}
