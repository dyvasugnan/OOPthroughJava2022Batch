import java.util.*;

class Oned{
	int size;
	int[] one;
	void enterElements(int s){
		size=s;
		one=new int[size];
		System.out.println("enter elements of oned array :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<this.size;i++) {
			one[i]=sc.nextInt();		
		}
	}
	void showElements() {
		for(int i=0;i<this.size;i++) {
			System.out.print(this.one[i]+" ");
		}
	}
	
}
class Twod {
	int rows;
	int cols;
	Oned[] two;
	Twod(int r,int c){
		rows=r;
		cols=c;
		two=new Oned[rows];
	}
	void createTwod() {
		for(int i=0;i<rows;i++) {
			this.two[i]=new Oned();
			two[i].enterElements(this.cols);
			
		}
	}
	void showElementsT() {
		for(int i=0;i<this.rows;i++) {
			two[i].showElements();
			System.out.println();
		}
	}
	
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twod t=new Twod(3,4);
		t.createTwod();
		t.showElementsT();
	}

}
