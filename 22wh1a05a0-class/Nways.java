import java.util.*;
public class Nways{
    public static int countOf(int n){
        int[] choices = new int[n+1];
        choices[0]=1;
        choices[1]=1;
        int i;
        for(i=2;i<=n;i++){
        choices[i] = choices[i-2] + choices[i-1];
        }
            return choices[n];
}
    public static void main(String[] args){
        int n;
        System.out.print("enter a number of steps ");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int choices= countOf(n);
        System.out.println("no. of choices = "+ choices);;
        }
}