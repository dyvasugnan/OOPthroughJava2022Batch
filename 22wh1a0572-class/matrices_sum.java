
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
    
       for(i=0;i<2;i++){
    	   for(j=0;j<2;j++) {
       
    	   System.out.println("enter: b"+" "+i+" "+j);
    	   b[i][j]=sc.nextInt();
       }} 
       for(i=0;i<2;i++){
    	   for(j=0;j<2;j++) {
       
    	   System.out.print(b[i][j]+" ");
       }
    	   System.out.print("\n");}
       for(i=0;i<2;i++){
    	   for(j=0;j<2;j++) {
       
    	   c[i][j]=a[i][j]+b[i][j];
       }
    	}
       System.out.println("The sum of matrices:")
       for(i=0;i<2;i++){
    	   for(j=0;j<2;j++) {
       
    	   System.out.print(c[i][j]+" ");
       }
    	   System.out.print("\n");}
    }
    
}
