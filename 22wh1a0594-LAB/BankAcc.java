
package cseb;

import java.util.*;

class BankAcc{

	double bal;

	BankAcc(double b){

		bal = b;

	}

	void contact(double r) {

		Scanner sc = new Scanner(System.in);

		String pass;

		System.out.println("enter the password");

		pass = sc.next();

		if(pass.equals("abc123")) 

		{

			Intrest in = new Intrest(r);

			in.calculate();

		}

		else 

		{

			System.out.println("wrong password");

		}

	}

	class Intrest {

		double rate;

		Intrest(double r){

			rate = r;

			}

		void calculate() { 

			int t  = 2;

			double i = (bal*t*rate)/100;

			System.out.println("Intrest is "+i);

		}

	}

}

public class BankDetails {

	public static void main(String[] args) {

		BankAcc b = new BankAcc(1000);

		b.contact(9.6); 

	}

}

You may be offline or with limited connectivity. Try downloading instead.
