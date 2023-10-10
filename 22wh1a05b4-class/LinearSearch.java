import java.util.*;
class LinearSearch{
  public static void main(String[] args){
   int arr[],key;
   int n,i,j;
   arr=new int[10];
   Scanner sc=new Scanner(System.in);
   System.out.print("enter size of array");
   n=sc.nextInt();
   System.out.print("enter array elements:");
   for(i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.print("enter element to be searched");
   key=sc.nextInt();
   for(j=0;j<n;j++)
   {
     if(arr[j]==key)
     {
      System.out.print("element is found at"+j);
     }
   }
   
  }
}