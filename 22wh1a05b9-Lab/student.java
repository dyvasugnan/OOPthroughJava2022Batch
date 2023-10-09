import java.util.*;
public class student{
	public static void main(String[]args){
		int a1,a2,a3;
		float avgmarks;
		float totalmarks;
	}
	void getData(){
		Scanner sc=new Scanner(Sytem.in);
		String  name=sc.nextLine();
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
	}
	void markcal(){
		avgmarks=(a1+a2+a3)/3;
		totalmarks=a1+a2+a3;
	}
	void display(){
		System.out.println("enter marks of a1:"+a1);
		System.out.println("enter marks of a2:"+a2);
		System.out.println("enter marks of a3:"+a3);
		System.out.println(avgmarks);
		System.out.println(totalmarks);
	}
}
class demo{
	main(){
		student s=new student();
			s.getData();
			s.markcal();
			s.display();
	}
}