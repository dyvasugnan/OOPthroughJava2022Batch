import java.io.*;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char ch;
        String str = "";
        for (int i=0; i<A.length(); i++)
      {
        ch= A.charAt(i);
        str= ch+str;
      }
      if(A.equals(str))
        System.out.print("It is a palindrome");
      else
        System.out.print("It isn't a palindrome");
    }
}
