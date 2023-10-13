import java.util.Scanner;
public class StringAltenateMerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l2>l1) {
			sub(s1,s2,l1);
		}
		else {
			sub(s2,s1,l2);
		}
	}
	static void sub(String s1,String s2,int l1) {
		String s3 = new String();
		int i = 0;
		while(i<l1) {
			s3+=s1.substring(i,i+1)+s2.substring(i,i+1);
			i++;
		}
		s3+=s2.substring(l1);
		System.out.println(s3);
	}
}
