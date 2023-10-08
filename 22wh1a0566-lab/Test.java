
import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println("enter the no of students :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter the marks : ");
		for(int i=0;i<n;i++){
			marks[i]=sc.nextInt();
		}
		int c;
		for(int i=0;i<n;i++){
			if(marks[i]!=0){
				c=0;
				for(int j=i+1;j<n;j++){
					if(marks[j]==marks[i]){
						marks[j]=0;
						c=1;
					}
				}
				if(c==1){
					marks[i]=0;
				}
			}
		}
		int large=marks[0];
		for(int i=1;i<n;i++){
			if(marks[i]>large){
				large=marks[i];
			}
		}
		if(large==0){
			System.out.println("Everyone copied. No max mark");
		}
		else{
			System.out.println("max marks: "+large);
		}
	}
}
		