package java_third_lab;
import java.util.*;


public class MergeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1=sc.next();
		System.out.println("Enter the second string : ");
		String s2=sc.next();
		String s3=new String();
		int i=0,j=0;
		while((i<s1.length())&&(j<s2.length())) {
			s3+=s1.substring(i,i+1);
			s3+=s2.substring(j,j+1);
			//System.out.println(s3+" "+i+" "+j);
			i+=1;
			j+=1;
		}
		//System.out.println(s3+" "+i+" "+j);
		
		if(i<s1.length()) {
			s3+=s1.substring(i);
		}
		if(j<s2.length()) {
			s3+=s2.substring(j);
		}
		System.out.println("Merged string : \n"+s3);
	}

}
