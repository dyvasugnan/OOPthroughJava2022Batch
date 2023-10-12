import java.util.*;
class Subarray{
     public static void main(String[]args){
         int i,j,k,m;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter number of elements:");
         int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("enter array elements:");
         for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         for(i=0;i<n;i++){
             for(j=i;j<n;j++){
               for(k=i;k<=j;k++){
                  System.out.print(arr[i][j]);
                }
                System.out.println();}
         }
}
}
                 