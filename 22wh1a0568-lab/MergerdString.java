package cseb;

public class MergerdString {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "World";
		String merged;
		for(int i=0;i<s1.length();i=i+2) {
			merged = s1.substring(i,i+1);
			System.out.print(merged);
		}
		for(int i=0;i<s2.length();i=i+2) {
			merged = s2.substring(i,i+1);
			System.out.print(merged);
		}
		for(int i=1;i<s1.length();i=i+2) {
			merged = s1.substring(i,i+1);
			System.out.print(merged);
		}
		for(int i=1;i<s2.length();i=i+2) {
			merged = s2.substring(i,i+1);
			System.out.print(merged);
		}
	}

}
