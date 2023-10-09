import java.util.*;
class Student{
	String student;
	int a1,a2,a3;
	float avgmarks;
	float totalmarks;
	
	void getData(){
		Scanner sc=new Scanner(System.in);
		student=sc.nextLine();
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
	}
	void markcal(){
		totalmarks=a1+a2+a3;
		avgmarks=(a1+a2+a3)/3;
		System.out.println(avgmarks);
	}
	void display(){
		System.out.println("enter marks of a1:"+a1);
		System.out.println("enter marks of a2:"+a2);
		System.out.println("enter marks of a3:"+a3);
		System.out.println(avgmarks);
		System.out.println(totalmarks);
	}
}
class Demo1{
	public static void main(String[] args){
		Student s=new Student();
			s.getData();
			s.markcal();
			s.display();
	}
}