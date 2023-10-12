import java.util.*;

public class City {
    public static void main(String[] args)throws IOException {
	int i=0;
	int search;
        BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
	String[] cities = new String[10];
        System.out.println("Enter cities: ");

        for (i=0;i<10;i++){
            cities[i] =br.readline();
        }
        System.out.print("Enter key");
        String key = br.readLine();
        for(i=0;i<10;i++) {
            if(cities[i]==key){
              search=i;
              break;
            }}
        
        System.out.println("Key found at:"+search);
        }}
