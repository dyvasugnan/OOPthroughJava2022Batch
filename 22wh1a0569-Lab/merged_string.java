import java.util.*;
class MergedString {
	public static void main(String[] args) {

		int i,j;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter first string:");

		String str1=sc.nextLine();

		System.out.println("enter second string:");

		String str2=sc.nextLine();

		int n=str1.length();

		int m=str2.length();
		String s=" ";

        for(i=0;i<n;i++){
            if(i%2==0){
                s=str1.substring(i,i+1);
                System.out.print(s);
                
            }
           
        }
        for(j=0;j<m;j++){
            if(j%2==0){
                s=str2.substring(j,j+1);
                System.out.print(s);
            }
        }
        for(i=1;i<n;i=i+2){
            s=str1.substring(i,i+1);
            System.out.print(s);
        }
        for(j=1;j<m;j=j+2){
            s=str2.substring(j,j+1);
            System.out.print(s); 
        }
            
        
	}
}