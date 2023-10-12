import java.io.*;
class Capitalize{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("enter any sentence:");
        String s= br.readLine();
        String words[]=s.split(" ");
        int i;
        for(i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()>0){
                System.out.print("first letter of each word capitalized"+Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase()+" ");
                
            }
        }       
    }
}