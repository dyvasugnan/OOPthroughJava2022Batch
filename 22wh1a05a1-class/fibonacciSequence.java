import java.util.*;
public class fibonacciSequence{
public static void main(String [ ] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of steps");
int n = sc.nextInt();
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
}
}

