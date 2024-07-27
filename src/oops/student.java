package oops;

import java.util.Scanner;

public class student {
    String Name;
    int roll,m1,m2,m3,sum;
    double avg;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        Name=sc.nextLine();
        System.out.print("Enter roll no. of the student: ");
        roll=sc.nextInt();
        System.out.print("Enter the marks of 3 subjects: ");
        m1=sc.nextInt();m2=sc.nextInt();m3=sc.nextInt();
    }
    void calc(){
        sum=m1+m2+m3;
        avg=sum/3;
    }
    void disp(){
        calc();
        System.out.println("Name: "+Name);
        System.out.println("Roll no."+roll);
        System.out.println("marks of 3 subjects: "+m1+m2+m3);
        System.out.println("Sum of marks: "+sum);
        System.out.println("Average of marks: "+avg);
    }
}
class T2{
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.getdata();
        s2.getdata();
        s1.disp();
        s2.disp();
    }
}
