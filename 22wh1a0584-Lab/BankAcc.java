package cseb;

import java.util.*;

class BankDemo {



	double bal;

	BankDemo(double b)

	{

		bal=b;

	}

	void contact(double r)

	{

		Scanner sc=new Scanner(System.in);

		String pwd;

		System.out.println("Enter pwd");

		pwd=sc.next();

		if (pwd.equals("abc123")) {

			Interest in =new Interest(r);

			in.calcInter();

		}

		else {

			System.out.println("Not");

		}//end of contact

	}

		

		class Interest{

			double rate;

			Interest (double r){

				rate=r;

			}

			void calcInter() {

				//body of calcInter Method

				double si=((bal*rate)/100);

				System.out.println("Interest is:"+si);

			}

		}

	

}	

		  

public class BankAcc

{

	public static void main(String[] args)

	{

		BankDemo b=new BankDemo(1000);

		b.contact(9.6);

	}

	

}