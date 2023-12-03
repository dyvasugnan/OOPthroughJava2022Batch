import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        System.out.println("Enter Target:");
        int target=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
            if (arr[i]+arr[j]==target){
              System.out.println(i+" "+j+" ");
              count++;
            }
        }
        if(count==0){
            System.out.println("No pairs are found");
        }
    }
}