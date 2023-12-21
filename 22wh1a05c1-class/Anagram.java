
import java.util.Arrays;
public class Main{
    static boolean Anagram(String str1,String str2){
            String s1=str1.replaceAll("\\s"," ");
            String s2=str2.replaceAll("\\s"," ");
            boolean status=true;
            if(s1.length()!=s2.length()){
                status = false;
            }
            else{
                char[] s1Arr=s1.toLowerCase().toCharArray();
                char[] s2Arr=s1.toLowerCase().toCharArray();
                Arrays.sort(s1Arr);
                Arrays.sort(s2Arr);
               status= Arrays.equals(s1Arr,s2Arr);
            }
            return status;
    }

 public static void main(String[] args){
    String str1="LISTEN";
    String str2="SILENT";
    if(Anagram(str1,str2)){
        System.out.println(str1+" and "+str2+" " are anagrams);
    }
    else{
         System.out.println(str1+" and "+str2+" " are not anagrams);
    }
}
}