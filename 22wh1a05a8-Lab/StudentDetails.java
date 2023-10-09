class Student{
	float avg,total;
	Student(){
		String rno = "22wh1a05a8";
		System.out.println("The Rollno of the student is "+rno);
	}
	Student(String name){
		System.out.println("The name of the student is "+name);
	}
	Student(int m1,int m2,int m3){
		total = (m1+m2+m3);
		avg = (total/3);
		System.out.println("Average marks of the student is "+avg);
	}
}
public class StudentDetails{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student("Hima Varsha.K");
		Student s3 = new Student(80,90,100);
	}
}