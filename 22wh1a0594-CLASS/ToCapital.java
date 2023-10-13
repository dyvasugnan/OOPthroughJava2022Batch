import java.util.*;

class FirstLetter {
    public static void main(String[] args) {
        String str = "hi my name is harshitha.";
        StringTokenizer st = new StringTokenizer(str, " ");
        
        String n1 = st.nextToken().trim();
        String n2 = st.nextToken().trim();
        String n3 = st.nextToken().trim();
        String n4 = st.nextToken().trim();
        String n5 = st.nextToken().trim();
        
        char uletter1 = Character.toUpperCase(n1.charAt(0));
        char uletter2 = Character.toUpperCase(n2.charAt(0));
        char uletter3 = Character.toUpperCase(n3.charAt(0));
        char uletter4 = Character.toUpperCase(n4.charAt(0));
        char uletter5 = Character.toUpperCase(n5.charAt(0));
        
        String s1 = n1.substring(1);    // "i"
        String s2 = n2.substring(1);    // "y"
        String s3 = n3.substring(1);    // "ame"
        String s4 = n4.substring(1);    // "s"
        String s5 = n5.substring(1);    // "arshitha"
        
        String ucase = uletter1 + s1 + " " + uletter2 + s2 + " " + uletter3 + s3 + " " + uletter4 + s4 + " " + uletter5 + s5;
        System.out.println("First letters of each word are: " + ucase);
    }
}
