import java.util.*; 
class One{ 
    int size;
    void array(){ 
    int i; 
    //int a[]=new int[size]; 
    Scanner sc=new Scanner (System.in); 
    size=sc.nextInt(); 
    int a[]=new int[size]; 
    for (i=0;i<size;i++) { 
        a[i]=sc.nextInt(); 
        
    } 
    for (i=0;i<size;i++) 
    { 
        System.out.println("array elements are:"+a[i]); 
        
    } 
        
    } 
    
} 
class Two { 
    void arr(int rows){ 
        int columns,i,j; 
        Scanner sc=new Scanner (System.in); 
        //rows=sc.nextInt(); 
        columns=sc.nextInt(); 
        int a[][]=new int[rows][columns]; 
        for (i=0;i<rows;i++)
        { 
            for(j=0;j<columns;j++)
            { 
                a[i][j]=sc.nextInt(); 
                
            } 
            
        } 
        for (i=0;i<rows;i++)
        { 
            for(j=0;j<columns;j++)
            {
                System.out.print(a[i][j]); 
                
            } 
            System.out.println(); 
            
        } 
        
    } 
    
} 
public class HelloWorld { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
        One o=new One(); 
        o.array();
        int rows=o.size;
        Two t=new Two();
        t.arr(rows); 
        
    } 
    
}