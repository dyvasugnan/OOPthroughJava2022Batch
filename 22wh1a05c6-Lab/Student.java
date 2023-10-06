import java.util.*;
class Student{
	int marks1,marks2,avg,sum;
	String name;

void input(){
	Scanner sc = new Scanner(System.in);
	name = sc.next();
	marks1 = sc.nextInt();
	marks2 = sc.nextInt();	
}
void calc(){
	sum = marks1 + marks2;
	avg = sum/2;
	
}
void display(){
	System.out.println("Name of the student: "+ name);
	System.out.println("Marks in Subject1: "+ marks1);
	System.out.println("Marks in Subject2: "+ marks2);
	System.out.println("Average of two subjects "+ avg);
}
}
class Result{
	public static void main(String[] args){
		Student s = new Student();
		s.input();
		s.calc();
		s.display();	
	}

}