import java.util.*;
class Student{
	int math_marks,eng_marks,science_marks;
	Student(int a,int b,int c){
		math_marks = a;
		eng_marks = b;
		science_marks = c;
	}	
	double cal_average(){
		return (math_marks+eng_marks+science_marks)/3;
	}
	int cal_sum(){
		return math_marks+eng_marks+science_marks;
 	}
}
class Display{
	public static void main(String[] args){
		Student st = new Student(10,20,30);
		System.out.println(st.cal_average());
		System.out.println(st.cal_sum());
	}
}