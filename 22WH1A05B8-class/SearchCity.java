import java.util.*;
import java.io.*;
import java.lang.*;
public class SearchCity{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter cities seperated by spaces:");
        String str=br.readLine();
        String city[]=new String[10];
        System.out.println("Enter city you want to search:");
        city=str.split(" ");
        String search=br.readLine();
        boolean bool=false;
        for(int i=0;i<city.length;i++){
            String word=city[i];
            if(word.equals(search)){
                System.out.println(search+" is found.");
                bool=true;
                break;
            }
            
        }if(!bool){
                System.out.println(search+" is not found!");
            }
        
     }
}