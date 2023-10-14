import java.util.*;
import java.io.*;

public class Panagram{
    public static void main(String[] args) throws IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //cases ignoring
        String str=br.readLine().toLowerCase().replaceAll("\\s","");
        String pana="abcdefghijklmnopqrstuvwxyz";


        //converting into array inorder to sort and then remove duplicates and append to sr by StringBuilder class
        //and check the strings by 'matches' returning bool value.


        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        int n=arr.length;
        StringBuilder sr=new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                   sr.append(arr[i]);
                }
            }
            
    
            sr.append(arr[n-1]);
            
            String sorted=sr.toString();
            boolean ispana=sorted.matches(pana);
            if(ispana){
                System.out.println("panagram");
            }
            else{
                System.out.println("Not a panagram");
            }
            
        }
    }


