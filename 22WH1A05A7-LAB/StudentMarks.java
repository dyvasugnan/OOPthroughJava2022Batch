import java.util.Scanner;
class Student{
	int sub1;
	int sub2;
	int sub3;
	int averagemarks;
	int total;
	void Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks in three subjects");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}
	void calculation(){
		total = (sub1+sub2+sub3);
		averagemarks = (total/3);
	}
	void result(){
		System.out.println("average marks of the student is"+ averagemarks);
	}
}
public class StudentMarks{
	public static void main(String[]args){
		Student s1 = new Student();
		s1.Student();
		s1.calculation();
		s1.result();
	}
}		