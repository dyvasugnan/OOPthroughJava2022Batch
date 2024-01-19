import java.util.*;
class SpyNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(num!=0){
            sum+=num % 10;
            num/=10;
        }
        System.out.println("Sum of Digits is: "+sum);
        num=n;
        int product=1;
         while(num!=0){
            product *= num % 10;
            num=num/10;
        }
        System.out.println("Product of Digits is: "+product);
        if(sum==product){
            System.out.println("It is a Spy Number");
        }
        else{
            System.out.println("It is not a Spy Number");
        }
        
        
    }
}