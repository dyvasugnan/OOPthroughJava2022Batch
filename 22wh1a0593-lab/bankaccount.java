package sample;
import java.util.*;
class BankAcc{
	double bal;
	BankAcc(double b){
		bal= b;
	}
	void contact(double r) {
		Scanner sc =  new Scanner(System.in);
		String pass;
		System.out.println("Enter the pass:");
		pass = sc.next();
		if(pass.equals ("abc#"))
		{
			Intrest in = new Intrest(r);
			in.calInter();
		}
		else {
			System.out.println("invalid password");
		}
	}
	class Intrest{
		double rate;
		Intrest( double r){
		 rate = r;
			}
		void calInter() {
			int t=2;
			double v=bal*t*rate;
			double h=v/100;
			System.out.println("interest is"+h);
		}
	}

}
public class BankDemo {
	public static void main(String[] args) {
		BankAcc b = new BankAcc(1000);
		b.contact(9.6);
	}
}
