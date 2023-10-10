import java.util.*;
class Student {
	String name;
	int rno;
	void read(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name");
		name = sc.next();
		System.out.print("Enter your Roll number");
		rno = sc.nextInt();
	}
	void printing(){
		System.out.println(name);
		System.out.println(rno);		
	}
}
class Marks {
public static void main(String[] args){
Student t = new Student();      //creating object
	t.read();
	t.printing();
	int m1,m2,m3,sum;
	float average;
	m1 = 10;
	m2 = 20;
	m3 = 30;
	sum = m1+m2+m3;
	System.out.println(sum);
	average = sum/2;
	System.out.println(average);
	} 
}
	
	