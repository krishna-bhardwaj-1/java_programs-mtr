import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r=sc.nextInt();
        System.out.println("Circumference of the circle is: "+2*3.14f*r);
        System.out.println("Area of the circle is: "+3.14f*r*r);
    }
}
