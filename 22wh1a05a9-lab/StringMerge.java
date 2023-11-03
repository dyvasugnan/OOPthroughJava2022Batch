package CSEB5A9;
import java.util.Scanner;
public class StringMerge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1");
		String s1=sc.next();
		System.out.println("enter string2");
		String s2=sc.next();
		String combinedstring=CombineAlternateCharacter(s1,s2);
		System.out.println("combined string:"+ combinedstring);
	public static String CombineAlternateCharacter(String s1,String s2) {
		StringBuilder result=new StringBuilder();
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length()) {
			result.append(s1.charAt(i));
			result.append(s2.charAt(j));
			i++;
			j++;
		}
		while(i<s1.length()) {
			result.append(s1.charAt(i));
			i++;
		}
		while(j<s2.length()) {
			result.append(s2.charAt(j));
			j++;
		}
		return result.toString();
	}
}	
