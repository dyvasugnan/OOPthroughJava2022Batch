import java.util.*;
import java.lang.*;
class OneD{
	int[] one_d_array;
	void oned_array(){
		System.out.println("Enter size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		one_d_array=new int[size];
		for(int i=0;i<size;i++)
		{
			one_d_array[i]=sc.nextInt();
		}
		System.out.println("One D array is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(one_d_array[i]+" ");
		}
		
	}
}
class TwoD extends OneD{
	void twod_array(){
		System.out.println("Enter size of rows:");
		Scanner vc=new Scanner(System.in);
		int rows=vc.nextInt();
		System.out.println("Enter size of columns:");
		int columns=vc.nextInt();
		
		int two_d_array[][]=new int[rows][columns];
		int index=0;
		for (int i=0; i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
					if(index<one_d_array.length)
					{
						two_d_array[i][j]=one_d_array[index++];
					}
				
				
			}
		}
		
		for(int j=0;j<columns;j++){
			for(int i=0;i<rows;i++){
				System.out.print(two_d_array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
class ThreeD extends TwoD{
	void threed_array(){
		System.out.println("Enter size of rows:");
		Scanner pc=new Scanner(System.in);
		int rows=pc.nextInt();
		System.out.println("Enter size of columns:");
		int columns=pc.nextInt();
		System.out.println("Enter size of third dimension:");
		int third_dimension=pc.nextInt();
		
		int three_d_array[][][]=new int[rows][columns][third_dimension];
		int index=0;
		for (int i=0; i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				for(int k=0;k<third_dimension;k++)
					if(index<one_d_array.length)
					{
						three_d_array[i][j][k]=one_d_array[index++];
					}
				
				
			}
		}
		
			for(int i=0;i<rows;i++){
				
				for(int j=0;j<columns;j++){
					for(int k=0;k<third_dimension;k++) {
				
						System.out.print(three_d_array[i][j][k]+" ");
					}
					System.out.println();
				}
		
			}
	}
}

public class Array_assignmnet {

	public static void main(String[] args) {
		
		ThreeD y=new ThreeD();
		y.oned_array();
		y.twod_array();
		y.threed_array();
	}

}

