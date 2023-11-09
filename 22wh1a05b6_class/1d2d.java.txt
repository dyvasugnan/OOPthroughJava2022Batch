import java.util.*;

class OneD{
	int column;
	int[] arr1;
	int[] createOneDarr(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of this row :");
		arr1=new int[column];
		for(int i=0;i<column;i++) {
			arr1[i]=sc.nextInt();
		}
		return arr1;
	}
	void displayOneDarr() {
		for(int i=0;i<column;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}

class TwoDarr extends OneDarr{
	int rows;
	int[][] arr2;
	TwoDarr(int r,int c){
		rows=r;
		column=c;
		arr2=new int[rows][column];
		for(int i=0;i<rows;i++) {
			arr2[i]=createOneDarr();
		}
	}
	void displayTwoDarr() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
public class TwoDArrayUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDarr t=new TwoDarr(3,4);
		t.displayTwoDarr();
	}

}