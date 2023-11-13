package cseb;
import java.io.*;
public class MergeString {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Strings:");
		String Str1=br.readLine();
		String Str2=br.readLine();
		String result=" ";
		for(int i=0;i<Str1.length();i++)
		{
			char c=Str1.charAt(i);
			result+=c;
			for(int j=i;j<Str2.length();j++)
			{
				char d=Str2.charAt(j);
				result+=d;
				break;
			}
			
		}
		System.out.print(result);
		
		//String Str3=Str1.concat(Str2);
		//System.out.println(Str3);
	}
}