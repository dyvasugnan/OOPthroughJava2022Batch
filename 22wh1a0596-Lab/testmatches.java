import java.util.Scanner;
class testmatches{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no of test matches he played");
		int match = obj.nextInt();
		System.out.println("enter no of ODI's he played");
		int ODI = obj.nextInt();
		System.out.println("enter yes or no if played for India");
		String played = obj.nextLine();
		System.out.println("enter yes or no if he is man of the match");
		String MOM = obj.nextLine();
		System.out.println("enter yes or no if he played IPL");
		String IPL = obj.nextLine();
		double amount = 0;
		if(match > 10 && ODI == 100){
			amount += 50000;
			System.out.println(amount);
		}
		else if(match > 10){
			amount += 25000;
			System.out.println(amount);
		}
		else if(ODI > 100){
			amount+ = 15000;
			System.out.println(amount);
		}
		else if(played == "yes"){
			amount += 10000;
			System.out.println(amount);
		}
		else if(played == "yes" && IPL == "yes"){
			amount += 8000;
			System.out.println(amount);
		}
		else if(played == "no" && IPL == "no"){
			amount += 7000;
			System.out.println(amount);
		}
		else if (MOM == "yes"){
			amount = amount + 0.25 * amount;
			System.out.println(amount);
		}
	}
}