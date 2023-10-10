import java.util.*;
class Student{
	int m1,m2,m3; //subject marks
	String name;
	int sum;
	float average;
	void data(){
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
        }
  	void calcSum(){
		sum=m1+m2+m3;
		
	}
        void calcAvg(){
		average=sum/3;
		
	}
	void display(){
		System.out.println("Stuent name: "+name);
		System.out.println("Marks in subject1: "+m1);
		System.out.println("Marks in Subject2: "+m2);
		System.out.println("Marks in Subject3: "+m3);
    		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
   	}
	}
        class StudentTestMarks{
 		public static void main(String[] args){
			Student s1=new Student();
			s1.data();
			s1.calcSum();
			s1.calcAvg();
			s1.display();
	}
	}


	
	