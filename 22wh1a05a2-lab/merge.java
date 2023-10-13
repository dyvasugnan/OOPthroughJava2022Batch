package cseb;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		System.out.println("enter string 1");
		str1 = sc.next();
		String str2;
		System.out.println("enter string2");
		str2  = sc.next();
		String str3 =" ";
		str3=str1+str2.substring(0);
		System.out.println("merger string="+str3);

	}

}
