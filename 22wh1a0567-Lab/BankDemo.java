package cse22567;
import java.util.*;
class BankAcc{
	double bal;
	BankAcc(double b){
		bal=b;
	}

	void contact(double r) {
		
		Scanner sc =new Scanner (System.in);
		String password ;
		System.out.println("enter password");
		password = sc.next();
		if(password.equals("567")) {
			Interest in =new Interest(r);
			in.calInter();
		}
		else {
			System.out.println("Not!");
		}
			
		}
	private class Interest {
		double rate;
		Interest(double r){
			rate =r;
		}
		void calInter() {
			System.out.println("rate");
			
		}
	}
}
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc b = new BankAcc(2000);
		b.contact(3.6);
		}
	}
