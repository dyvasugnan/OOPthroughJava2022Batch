import java.util.Scanner;
class StudentMarks{
       String student;
       int m1,m2,m3,avg,sum;
       float avgmarks;
       void getData(){
       Scanner sc=new Scanner(System.in);
       student=sc.next();
       m1 = sc.nextInt();
       m2 = sc.nextInt();
       m3 = sc.nextInt();
}
void calcMarks(){
       sum=(m1+m2+m3);
       avg=(sum)/2;
}
void displayData(){
       System.out.println("Sub 1 marks"+m1);
       System.out.println("Sub 2 marks"+m2);
       System.out.println("Sub 3 marks"+m3);
       System.out.println("average"+avg);
       System.out.println("Sum"+sum);
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
      