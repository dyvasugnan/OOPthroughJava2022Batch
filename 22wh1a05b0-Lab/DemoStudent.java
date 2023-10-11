import java.util.*;

class Student{
	String name;
	int marks1,marks2,marks3;
	double average_marks,total_marks;
	//Creating Scanner Object
	Scanner scan = new Scanner(System.in);	
	//Function to read marks from user
	void readMarks(){
		System.out.print("Enter Name of the Student: ");
		name = scan.nextLine();
		System.out.print("Enter Subject 1 marks:");
		marks1 = scan.nextInt();
		System.out.print("Enter Subject 2 marks:");
		marks2 = scan.nextInt();
		System.out.print("Enter Subject 3 marks:");
		marks3 = scan.nextInt();
		}
	//Function to calculate total marks and average marks
	void calculateMarks(){
		total_marks = marks1+marks2+marks3;
		average_marks = total_marks/3;
		}
	//Function to display results
	void displayMarks(){
		System.out.println("Student Name: " +name);
		System.out.println("Subject 1 Marks: " +marks1);
		System.out.println("Subject 2 Marks: " +marks2);
		System.out.println("Subject 3 Marks: " +marks3);
		System.out.println("Total Marks: " +total_marks);
		System.out.println("Average Marks: " +average_marks);
		}
	}


class Demo{
	public static void main (String[] args){
		Student student = new Student();
		student.readMarks();
		student.calculateMarks();
		student.displayMarks();		
	}
}