import java.io.*;
import java.util.*;

class Data {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String S1 = br.readLine();
        StringTokenizer st = new StringTokenizer(S1, " ");
        int word_count = st.countTokens();
        String[] words = new String[word_count];
        int i = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            words[i] = word;
            i++;
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
