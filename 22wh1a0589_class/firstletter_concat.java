import java.lang.*;
import java.io.*;
import java.util.*;
class Data{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string:");
        String S1 = br.readLine();
        StringTokenizer st = new StringTokenizer(S1," ");
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            char a = word.charAt(0);
            System.out.print(a);
        }
        
    }
}