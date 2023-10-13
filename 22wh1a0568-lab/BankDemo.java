package cseb;
import java.util.*;
class BankAcc{
	double bal;
	BankAcc(double b){
		bal = b;
	}
	void contact(double rate,int time) {
		int password = 568;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password:");
		int pass = sc.nextInt();
		if (password == pass) {
			Interest in = new Interest(rate,time);
			in.cal();
		}
		else
			System.out.print("Wrong Password");
	}
	private class Interest{
		double rate;
		int time;
		Interest(double r,int t){
			rate = r;
			time = t;
		}
		void cal() {
			double interest = bal*rate*time / 100;
			System.out.println("Interest is: " + interest);
		}
	}
}
public class BankDemo {
	public static void main(String[] args) {
		BankAcc b = new BankAcc(1000);
		b.contact(9.6,1);
			
	}
}
