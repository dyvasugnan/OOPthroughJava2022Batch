import java.io.*;
import java.util.*;
class LinearSearchArrays {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city[] = new String[10];
        for(int i=0;i<10;i++)
            city[i] = br.readLine();
        String c = br.readLine();
        int result = search(city,c);
        if(result==-1)
            System.out.println("not found");
        else
            System.out.println(result);
    }
    static int search(String[] city, String c){
            for(int i=0;i<10;i++){
                if(city[i].equals(c))
                    return i;
            }
            return -1;
    }
}
