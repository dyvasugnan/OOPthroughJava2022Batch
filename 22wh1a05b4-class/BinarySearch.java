import java.util.*;
class BinarySearch{
  public static void main(String[] args){
   int arr[],key;
   int n,i;
   arr=new int[10];
   Scanner sc=new Scanner(System.in);
   System.out.print("enter size of array");
   n=sc.nextInt();
   System.out.print("enter array elements:");
   for(i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   System.out.print("enter element to be searched:");
   key=sc.nextInt();
   int low=0;
   int high=n-1;
   while(low<=high)
   {
     int mid=(low+high)/2;
     if(key==arr[mid])
     {
       System.out.print("element is found at:"+mid);
       break;
     }
     if(arr[mid]>key)
     {
       high=mid-1;
     }else
     {
      low=mid+1;
     }
   }
  }
}


