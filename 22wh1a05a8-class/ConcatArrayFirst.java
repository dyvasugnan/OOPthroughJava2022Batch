import java.io.*;
import java.util.*;
class ConcatArrayFirst{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city[] = new String[10];
        String firLets = "";
        for (int i = 0; i < 10; i++) 
            city[i] = br.readLine();
        for (int i = 0; i < 10; i++) {
                char firLet = city[i].charAt(0);
                firLets += firLet;
        }
        System.out.println(firLets);
    }
}
