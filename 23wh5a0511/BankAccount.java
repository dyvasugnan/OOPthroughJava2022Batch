package cseb;
import java.util.*;
class BankAccount
{
	double bal;
	BankAccount(double b)
	{
		bal=b;
		
	}
	void contact(double r)
	{
		Scanner sc = new Scanner(System.in);
		String pwd;
		System.out.println("enter pwd");
		pwd = sc.next();
		if(pwd.equals("abc123"))
		{
			Calculator in = new Calculator(r);
			in.cal();
		}
		else
		{
			System.out.println("not");
		}
		
	}
	class Calculator
	{
		double rate;
		Calculator(double r){
			rate = r;
		}
		void cal()
		{
			int t = 5;
			double intrest = (bal * rate * t)/1000;
			System.out.println(intrest);
		}
	}
}

public class BankDemo {
	public static void main(String[]args)
	{
		BankAccount b = new BankAccount(10000);
		b.contact(9.6);
	}


		// TODO Auto-generated constructor stub
	}


