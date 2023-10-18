import java.util.*;
class Student{
	int m1,m2,m3;
	void marks(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first subject marks");
		m1=sc.nextInt();
		System.out.println("enter the second subject marks");
		m2=sc.nextInt();
		System.out.println("enter the third subject marks");		
		m2=sc.nextInt();
		}
	void total(){
		int total =m1+m2+m3;
		System.out.println("total:" + total);
		int avg=total/3;
		System.out.println("avg:" + avg);
		}
	void display(){
		System.out.println("first subject marks :" +m1);
		System.out.println("second subject marks :" +m2);
		System.out.println("third subject marks :" +m3);
		} 
}
public class Demo{
	public static void main(String[] args){
		Student s1=new Student();
			s1.marks();
			s1.total();
			s1.display();
		}
}

