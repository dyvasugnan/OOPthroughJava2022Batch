package CSEB5A9;
import java.util.Scanner;
public class Panagramchecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pangram sentence");
		String input=sc.nextLine();
		if(ispangram(input))
			System.out.println("Input is pangram");
		else
			System.out.println("Not a pangram");
	}
	public static boolean ispangram(String input) {
		input=input.toLowercase();
		for(char letter="a";letter<="z";letter++) {
			if(input.indexOf(letter)==-1)
				return false;
		return true;
		}
	}
}
