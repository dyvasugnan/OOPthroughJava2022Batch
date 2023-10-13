import java.util.*;
class firstLetter {
    public static void main(String[] args) {
        String str = "hi my name is harshitha.";
        StringTokenizer st = new StringTokenizer(str," ");
        String n1 = st.nextToken().trim();
        String n2 = st.nextToken().trim();
        String n3 = st.nextToken().trim();
        String n4 = st.nextToken().trim();
        String n5 = st.nextToken().trim();
        String s2 = n1.substring(0,1);    //h
        String s3 = n2.substring(0,1);    //m
        String s4 = n3.substring(0,1);    //n
        String s5 = n4.substring(0,1);    //i
        String s6 = n5.substring(0,1);    //h
        String s1 = s2 + s3+s4+s5+s6;
        System.out.println("first letters of each word are: " +s1);
    }
}
