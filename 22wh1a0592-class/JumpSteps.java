import java.util.*;
import java.io.*;
public class JumpSteps{
public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter no of steps to climb");
    String s = br.readLine();
    int n = Integer.parseInt(s);
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    for(int i = 3; i <= n;i++){
    int c = a + b;
    System.out.println(c);
    a = b;
    b = c;
}