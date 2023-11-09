package javaprog;
import java.util.Scanner;


class OneDArr {
	int[] arr;
    
    void oneD() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter elements:");
        for (int i=0; i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
class TwoD extends OneDArr{
	void twoD(){
		System.out.println("Enter number of rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		System.out.println("Enter number of columns:");
		int col=sc.nextInt();
		int arr2[][]=new int[rows][col];
		int index=0;
		for (int i=0; i<rows;i++){
			for(int j=0;j<col;j++){
					if(index<arr.length){
						arr2[i][j]=arr[index++];
				}
		  }
		}

		for(int j=0;j<col;j++){
			for(int i=0;i<rows;i++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Demo {
    public static void main(String[] args) {
        TwoD obj=new TwoD();
        obj.oneD();
        obj.twoD();    
    }
}
