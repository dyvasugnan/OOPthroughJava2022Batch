import java.util.*;
public class Student{
  float m1,m2,m3;
  float avg;
  void getMarks(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of student(m1,m2,m3):");
    m1=sc.nextFloat();
    m2=sc.nextFloat();
    m3=sc.nextFloat();
}
  void calc(){
    avg=(m1+m2+m3)/3;
 }

  void display(){
    System.out.println(" subject 1 Marks:"+m1);
    System.out.println(" subject 1 Marks:"+m2); 
    System.out.println(" subject 1 Marks:"+m3);
   System.out.println("Avg Marks:"+avg); }

 public static void main(String args[]){
   Student S1=new Student();
   S1.getMarks();
   S1.calc();
   S1.display();

}}	