import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the range:");
        int n = obj.nextInt();
        System.out.println("enter the no to search");
        int x = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        linear_search(arr,n,x);
        }
    static void linear_search(int[] arr,int n,int x){
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
