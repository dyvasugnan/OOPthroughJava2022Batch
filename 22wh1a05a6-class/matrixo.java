import java.util.Scanner;
public class Array_1D{
	public static void main(Strings[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Size of the array is:");
               int size = sc.nextInt();
	   int [] arr = new int[size];
	  System.out.println("enter the elements of 1d array: ");
	  for(i = 0;i < size;i++){
                  arr[i] = sc.nextInt();
              }
	}
}
public class Array_2D{
	public static void main(Strings[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the no of rows: ");
	   int rows = sc.nextInt();
	  System.out.println("enter the no of columns: ");
	  int cols = sc.nextInt();
	  int matrix[][] = new int[rows][cols];
	 System.out.println("enter array elemnts :");
             for(i = 0;i < rows;i++){
	    for(j = 0;j < cols;j++){
		2dArray[i][j] = scanner.nextInt();