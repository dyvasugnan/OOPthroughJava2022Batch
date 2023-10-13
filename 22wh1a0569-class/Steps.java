import java.util.*;
class Steps{
    public static void main(String[]args){
        int a=0,b=1,c=a+b,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("number of steps:");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
           c=a+b;
           a=b;
           b=c;
       }
       System.out.println("count of ways:"+c);
}
}
   
    