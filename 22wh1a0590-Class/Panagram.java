import java.util.*;
public class Panagram {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			String all="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int c=0;
			if(s.length()>=26) {
				for(int i=0;i<52;i++) {
					for(int j=0;j<s.length();j++) {
						if((s.substring(j,j+1).toLowerCase()).equals(all.substring(i,i+1))) {
							c+=1;
							break;
						}
					}
				}
				if(c==26) {
					System.out.println("It is a panagram");
				}
				else {
					System.out.println("It is not a panagram");
				}
			}
			else {
				System.out.println("It is not a panagram");
			}
	}

}