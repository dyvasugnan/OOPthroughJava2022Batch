import java.io.*;
class StringCapitalize {
    public static void main(String[] args) throws IOException{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println("Enter the string :");
            String s = br.readLine();
            String [] k = s.split(" ");
            
            for (int i = 0 ; i < k.length ; i++){
                
                char first = Character.toUpperCase(k[i].charAt(0));
                System.out.print(first);
            

    }
    }
}
