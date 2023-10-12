import java.util.*;
public class Subarrays {
    public static void main(String[] args) {
        int size;
        int target;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        target=sc.nextInt();
        int sum=0;
        int a[]=new int[size];
        System.out.println("taking ele:");
        for(int p=0;p<size;p++)
        {
          a[p]=sc.nextInt();
        }
        System.out.println("printing ele:");
        for(int p=0;p<size;p++)
        {
          System.out.print(a[p]+" ");
        }
         System.out.println("\nSubarrays");
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                  sum+=a[j];
                  if(sum==target){
                   for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
             
                System.out.println(); 
            }
            }
        }
    }
}