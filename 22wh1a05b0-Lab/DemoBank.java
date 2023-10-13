package java_225B0_CSEB;

import java.util.Scanner;
class BankAcc{
	double balance;
	BankAcc(double b){
		balance = b;
	}
	void contact(double r) {
		Scanner scan = new Scanner(System.in);
		String pass;
		System.out.println("Enter Password");
		pass = scan.next();
		scan.close();
		if (pass.equals("Password")) {
			Interest in = new Interest();
			in.si(r,2);			
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	// End of Contact Method
		 class Interest{
			double rate;
			void si(double r,int time) {
				rate = r;
				double si;
				si= (balance * rate * time)/100;
				System.out.println("Simple Intrest: " + si);
			}
		}
		//End of Interest Class
}

public class DemoBank {
	public static void main(String[] args) {
		BankAcc b = new BankAcc(1000);
		b.contact(3);
	}

}
