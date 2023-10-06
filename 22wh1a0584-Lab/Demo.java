import java.lang.*;
import java.util.*;
class Student1{
     int marks1,marks2,marks3,total;
     double avg;
     
     void read(){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter marks in subject 1:");	
           marks1=sc.nextInt();
           System.out.println("Enter marks in subject 2:");
           marks2=sc.nextInt();
           System.out.println("Enter marks in subject 3:");
           marks3=sc.nextInt();
      }
      void totalMarks(){
           total=(marks1+marks2+marks3);
           System.out.println("total is:"+total);
           
      }
      void average(){
           avg=total/3;
           System.out.println("average is:"+avg);
           
      }
}
class Demo{
     public static void main(String[ ] args)
     {
          Student1 s=new Student1();
          s.read();
          s.totalMarks();
          s.average();
          
         
     }
}
          