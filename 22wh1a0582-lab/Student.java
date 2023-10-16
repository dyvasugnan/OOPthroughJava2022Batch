 import java.util.*;
public class Student{
       float m1,m2,m3,sum,avg;
void getMarks(){
Scanner sc=new Scanner(System.in);
System.out.println("enter marks of student:");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
}
void calc(){
   sum=m1+m2+m3;
   avg=(m1+m2+m3)/2;
}
void display(){
  System.out.println("first subject marks:"+m1);
  System.out.println("second subject marks:"+m2);
  System.out.println("third subject marks:"+m3);
  System.out.println("sum is"+sum);
  System.out.println("average is " +avg);
}
};
class Demo{

  public static void main(String[] args){
   Student s=new Student();
   s.getMarks();
   s.calc();
   s.display();

}
}