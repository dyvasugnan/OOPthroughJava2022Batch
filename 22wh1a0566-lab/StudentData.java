 import java.util.*;
class Student{
	int m1,m2,m3;
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first subject marks : ");
		m1=sc.nextInt();
		System.out.println("Enter the second subject marks : ");
		m2=sc.nextInt();
		System.out.println("Enter the third subject marks : ");
		m3=sc.nextInt();
	}
	void displayData(){
		System.out.println("First subject marks : "+m1);
		System.out.println("Second subject marks : "+m2);
		System.out.println("Third subject marks : "+m3);
	}
	void displayTotalandAverage(){
		int total=m1+m2+m3;
		System.out.println("Total marks : "+total);
		double average=total/3;
		System.out.println("Average : "+average);
	}
}
public class StudentData{
	public static void main(String[] args){
		Student s1=new Student();
		s1.getData();
		s1.displayData();
		s1.displayTotalandAverage();
	}
}
