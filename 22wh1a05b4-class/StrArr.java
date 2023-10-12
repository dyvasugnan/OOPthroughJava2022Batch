import java.util.*;
import java.lang.*;
import java.io.*;
class StrArr{
  public static void main(String[] args) throws IOException{
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   int i,j;
   String str[]=new String[20];
   System.out.print("enter no. of cities:");
   int n=Integer.parseInt(br.readLine());
   System.out.print("enter city names:");
   for(i=0;i<n;i++)
   {
     str[i]=br.readLine();
   }
   System.out.print("enter city to be searched");
   String key=br.readLine();
   for(j=0;j<n;j++)
   {
     if(str[j].equals(key))
     {
      System.out.print("city is found at:" +j);
     }
   }
   
  }
}
   