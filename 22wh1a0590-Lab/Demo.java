import java.util.Scanner;
class StudentMarks{
   String student;
   int m1,m2,m3,total;
   float avgmarks;
   void getData(){ 
    Scanner sc=new Scanner(System.in);
    student=sc.next();
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
  }

  void calcMarks(){
    total=(m1+m2+m3);
    avgmarks=(m1+m2+m3)/2;
    System.out.println("average is:" +avgmarks);
  }
  void displayData(){
    System.out.println("first subject marks:" +m1);
    System.out.println("second subject marks:" +m2);
    System.out.println("third subject marks:" +m3);
    System.out.println("Total is:" +total);
    System.out.println("average is:" +avgmarks);
  } 
}
  class Demo{
    public static void main(String[] args){
      StudentMarks s = new StudentMarks();
          s.getData();
          s.calcMarks();
          s.displayData();
  }
 }


 
     