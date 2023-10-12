import java.util.*;
import java.io.*;
import java.lang.*;
public class CapitalizeFirst{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
        String s[]=new String[10];
        s=str.split(" ");
        for(int i=0;i<s.length;i++){
            String word=s[i];
            System.out.print(Character.toString(Character.toUpperCase(word.charAt(0))) + word.substring(1)+" ");
        }
        
     }
}