import java.util.*;
class Student{
    String name;
    int m1,m2,m3,total;
    float avg;
    void Getdata(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3= sc.nextInt();
    }
    void Cal_Marks(){
        total = m1+m2+m3;
        avg = total/3;
    }
    void Display(){
        System.out.println("total:"+total);
        System.out.println("avg:"+avg);
    }

    public static void main(String[]arg){

        Student s = new Student();
        s.Getdata();
        s.Cal_Marks();
        s.Display();
    }

}



