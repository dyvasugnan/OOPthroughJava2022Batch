import java.util.*;


public class Calci {
    public static void main(String args[]) {
       int a[][]= new int[2][2];
       int b[][]= new int[2][2];
       int c[][]= new int[2][2];
       Scanner sc=new Scanner(System.in);
       int i,j;
       for(i=0;i<2;i++){
    	   for(j=0;j<2;j++) {
       
    	   System.out.println("enter: a"+" "+i+" "+j);
    	   a[i][j]=sc.nextInt();
       }}
       for(i=0;i<2;i++){
    	   for(j=0;j<2;j++) {
       
    	   System.out.print(a[i][j]+" ");
       }
    	   System.out.print("\n");}
    }
}
