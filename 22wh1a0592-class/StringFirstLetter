import java.io.*;
import java.util.*;
class StringFirstLetter{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city[] = new String[10];
        String newcity[] = new String[10];
        for(int i=0;i<10;i++)
            city[i] = br.readLine();
        for (int i = 0; i < 10; i++) {
                newcity[i] = city[i].substring(0,1).toUpperCase() + city[i].substring(1).toLowerCase();
        }
        for(int i=0;i<10;i++)
            System.out.print(newcity[i]+" ");
    }
}
