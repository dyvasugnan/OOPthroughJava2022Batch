
import java.util.*;
import java.io.*;
class Search {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter no. of cities-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter cities");
        String cities[]=new String[10];
        for(int i=0;i<n;i++)
        {
            cities[i]=br.readLine();
        }
        System.out.println("enter city to search-");
        String search_city=br.readLine();
        for(int i=0;i<n;i++)
        {
            if(cities[i].equals(search_city))
            {
                System.out.println("city is found at index "+i);
            }
            else
            {
                System.out.println("city not found at index "+i);
            }
        }
    }
}