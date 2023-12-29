import java.util.*;

class Student {
	int marks1;
	int marks2;
	int marks3;
	int total_marks;
	float average;
	
	//Reading the marks of any three subjects
	void enterData() 
	{
		System.out.println("Enter marks of three subjects: ");
		Scanner sc = new Scanner(System.in);
		marks1 = sc.nextInt();
		marks2 = sc.nextInt();
		marks3 = sc.nextInt();
	}

	//Calculating Total marks and average
	void calcMarks() 
	{
		total_marks = marks1 + marks2 + marks3;
		average = total_marks / 3;
	}

	//Displaying the marks, Total marks and average
	void displayData() 
	{
		System.out.println("The marks of the three subjects entered are: "+marks1+" "+marks2+" "+marks3);
		System.out.println("The Total marks of the three subjects entered is: "+total_marks);
		System.out.println("The Average marks of the three subjects is: "+average);
	}
}

class DemoStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.enterData();
		s.calcMarks();
		s.displayData();
	}
}

