package array;

public class array_2d_for_each {
    public static void main(String[] args) {
        int a[][] = {{10,20,30},{40,50,60}};
        for(int r[]:a){
            for(int c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
