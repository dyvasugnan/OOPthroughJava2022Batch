package LearningJava;
import java.io.*;

public class StringLinearSearch {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cities[] = new String[5];
		System.out.println("Enter 5 city names:");
		for(int i=0 ; i<5 ; i++) 
			cities[i] = br.readLine();
		System.out.print("Enter the city to be searched:");
		String search1 = br.readLine();
		int cityfound = 0;
		for(int i=0 ; i<5 ; i++) {
			if(cities[i].compareToIgnoreCase(search1) != 0) { 
				cityfound = 1;
				continue;}
			else
				System.out.print("City is found at " + i);
		}
		if(cityfound == 1)
			System.out.print("City not found");
	}
}
