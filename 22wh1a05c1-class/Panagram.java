import java.util.Arrays;
public class Main{

 public static void main(String[] args){
    String str="The quick brown fox jumps over the lazy dog";
    boolean panagram=ispanagram(str.toLowerCase());
    if(panagram){
        System.out.println(str+" is a panagram");
    }
    else{
         System.out.println(str+" is not panagram");
    }
}
static boolean ispanagram(String str){
    boolean[] letters=new boolean[26];
    int index;
    int count=0;
    for(int i=0;i<str.length();i++){
        char current=str.charAt(i);
        if('a'<=current && current<='z'){
            index=current-'a';
            if(!letters[index]){
                letters[index]=true;
                count++;
            }
        }
    }
    return count==26;
}
}