package oops;
import java.util.*;
public class Emp {
    String name,id,des,city;
    int sal;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter id: ");
        id = sc.nextLine();
        System.out.print("Enter destination: ");
        des = sc.nextLine();
        System.out.print("Enter city: ");
        city = sc.nextLine();
        System.out.print("Enter salary: ");
        sal = sc.nextInt();
    }
    void disp(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Destination: "+des);
        System.out.println("City : "+ city);
        System.out.println("Salary : "+sal);
        System.out.println();

    }
}
//for 1 employee
/*
class T{
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.input();
        e1.disp();
    }
}
 */
//for 2 employee
//class T{
//    public static void main(String[] args) {
//        Emp e1=new Emp();
//        Emp e2=new Emp();
//        e1.input();
//        e2.input();
//        e1.disp();
//        e2.disp();
//    }
//}
//  for N employee
class T{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of employee: ");
        int N =sc.nextInt();
        Emp e[]=new Emp[N];
        for(int i=0;i<N;i++){
            e[i]=new Emp();
            e[i].input();
        }
        for(int i=0;i<N;i++){
            e[i].disp();
        }
    }
}