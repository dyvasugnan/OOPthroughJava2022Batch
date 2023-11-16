import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l=0;
        int r=A.length()-1;
        boolean palindrome=true;
        while(l<r){
            if(A.charAt(l)!=A.charAt(r)){
                palindrome=false;
            }
            l++;
            r--;
        }
        if(palindrome){
            System.out.println("Yes palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
