import java.util.*;
class Age{
	int present_year,birth_year;
	Age(int p,int b){
		present_year = p;
		birth_year = b;
	}
	int cal_age(){
		return birth_year - present_year;
	}
}
class Display{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter name");
		String name = obj.next();
		System.out.println("enter present year");
		int p = obj.nextInt();
		System.out.println("enter birth year");
		int b = obj.nextInt();
		Age a = new Age(b,p);
		if (a.cal_age() < 18){
			System.out.println("not Valis for voting");
		}
		else if(a.cal_age() >= 18){
			System.out.println("valid for voting");
		}
	}
}
