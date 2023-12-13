package LearningJava;
import java.io.*;

public class GetTextReadText {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos = new FileOutputStream("MyFile.txt");
		System.out.println("Enter data 'till @':");
		char ch = (char)reader.read();
		while(ch !='@')
			fos.write(ch);
		fos.close();
		reader.close();
	}

}
