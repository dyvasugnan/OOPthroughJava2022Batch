import java.util.*;

class BankAcc
{
	double bal;
	BankAcc(double b)
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
		double inter = (bal* rate * t) /1000; 
	}
	}
}
public class BankDemo {
	public static void main(String args[])
	{
		BankAcc b =new BankAcc(10000);
		b.contact(2.4);
	}

}
