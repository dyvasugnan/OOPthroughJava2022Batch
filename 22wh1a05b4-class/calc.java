import java.util.*;

class OneD{

    int arr1[]=new int[10];


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int i;

    void read()

    {
        

      System.out.print("enter elements of array1:");

      for(i=0;i<n;i++)
      {

        arr1[i]=sc.nextInt();

      }

    }

    void print()
 
    {

      System.out.print("elements of array1:");

    
      for( i=0;i<n;i++){
        
        System.out.println(arr1[i]);
    
      }
    
    }

}

class TwoD{
  
   

}

class calc {
    
public static void main(String[] args) {
        
   OneD a=new OneD();
       
       
       
   a.read();
        
   a.print();
    
  }

}