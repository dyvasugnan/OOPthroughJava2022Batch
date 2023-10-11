import java.util.*;
import java.io.*;
import java.lang.*;
public class CitySearch{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of cities :");
		String s=br.readLine();
		int n=Integer.parseInt(s);
		String[] cities=new String[n];
		System.out.println("Enter cities : \n");
		StringTokenizer all_cities=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			cities[i]=all_cities.nextToken().trim();
		}
		System.out.println("enter the city to be searched : ");
		int city_index=-1;
		String search=br.readLine().trim();
		for(int i=0;i<10;i++){
			if(cities[i].equals(search)){
				city_index=i;
				break;
			}
		}
		if(city_index==-1){
			System.out.println("City not found.\n");
		}
		else{
			System.out.println("city found at index : "+city_index);
		}
	}
}
		

		
				