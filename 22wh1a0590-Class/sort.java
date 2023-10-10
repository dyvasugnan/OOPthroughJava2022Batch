import java.util.Scanner ;    
class Sort   
{    
static void sortarray ( int [] A , int n )  
{  
    int low = 0 ;  
    int mid = 0 ;  
    int high = n - 1 ;  
    while ( mid <= high )  
    {  
        if ( A [ mid ] == 0 )  
        {  
            int temp = A [ mid ] ;  
            A [ mid ] = A [ low ];  
            A [ low ] = temp ;  
            low = low + 1 ;  
            mid = mid + 1 ;  
          
        }  
        else if ( A [ mid ] == 1 )  
        {  
            mid = mid + 1 ;  
        }  
        else   
        {  
            int temp = A [ mid ] ;  
            A [ mid ] = A [ high ] ;  
            A [ high ] = temp ;  
            high = high - 1 ;  
              
        }  
    }     
}  
public static void main ( String args[] )    
{    
 int n ;  
 Scanner sc = new Scanner ( System.in ) ;  
 System.out.println ( " Enter number of elements :  " ) ;  
 n = sc.nextInt() ;  
 int [] array = new int[ 100 ] ;  
 System.out.println ( " Enter elements of the array :  " ) ;  
 for ( int i = 0 ; i < n ; i++ )  
 {  
     array[ i ] = sc.nextInt() ;  
 }  
 sortarray( array , n ) ;  
 System.out.println ( " Array after sorting : " ) ;  
  for ( int i = 0 ; i < n ; i++ )  
 {  
     System.out.println ( array[ i ] ) ;  
 }  
}    
}