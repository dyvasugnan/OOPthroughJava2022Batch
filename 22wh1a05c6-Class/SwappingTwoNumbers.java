import java.util.*;
 
class SwappingTwoNums {
 
     void swapping(int m, int n)
    { 
        int temp = m;
        m = n;
        n = temp;
        System.out.println("After swapping the numbers are: ");
        System.out.println("first number is " + m);
        System.out.println("second number is " + n) ;                  
    }
}
class SwappingTwoNumbers{
    public static void main(String[] args)
    {
        SwappingTwoNums a=new SwappingTwoNums();
        int m , n ;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        m=sc.nextInt();
        System.out.println("enter the second number: ");
        n=sc.nextInt();
        System.out.println("before swapping numbers are:");
        System.out.println("first number is" +m);
        System.out.println("second number is" +n);
        a.swapping(m,n);
    }
}
