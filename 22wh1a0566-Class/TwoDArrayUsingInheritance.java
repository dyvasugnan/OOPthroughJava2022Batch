import java.util.*;

class OneD{
	int cols;
	int[] arr1;
	int[] createOneD(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of this row :");
		arr1=new int[cols];
		for(int i=0;i<cols;i++) {
			arr1[i]=sc.nextInt();
		}
		return arr1;
	}
	void displayOneD() {
		for(int i=0;i<cols;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}

class TwoD extends OneD{
	int rows;
	int[][] arr2;
	TwoD(int r,int c){
		rows=r;
		cols=c;
		arr2=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			arr2[i]=createOneD();
		}
	}
	void displayTwoD() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
public class TwoDArrayUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoD t=new TwoD(3,4);
		t.displayTwoD();
	}

}
