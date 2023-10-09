import java.util.Scanner;
class Student{
	String name;
	int m1,m2,m3;
	float total,avg;
	void scan(){
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
	}
	void calc(){
		total = (m1+m2+m3);
		avg = (total/3);
	}
	void display(){
		System.out.println("Average marks of "+name+" is "+avg);
	}

}
public class StudentMarks{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.scan();
		s1.calc();
		s1.display();
	}
}
		
	
	