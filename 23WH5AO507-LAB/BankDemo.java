package cseb;

import java.util.Scanner;

public class BankDemo {
double bal;
BankDemo(double b)
{
	bal=b;
}
void contact(double r)
{
	Scanner sc=new Scanner(System.in);
	String pwd;
	System.out.println("enter pwd");
	pwd=sc.next();
	if(pwd.equals("enter pwd"){
		Interest  in=new Interest(r);
		in.calcinter();
		
	}
	else
	{
		System.out.println("not");
	}
}
private class calcinter{
	double rate;
	calcinter(double r){
		rate=r;
	}
	void cal()
	int si=(p*t*r)/100;
	
class Interest{
	double rate;
	Interest(double r){
		rate=r;
	}
	
}

	
}
public class BankAcc {
	public static void main(String[] args) {
		BankDemo b=new BankDemo(1000);
		b.contact(9,6);
	}
}