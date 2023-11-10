import java.util.Scanner;
class Array_1D{
    Row1(int size){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Size of the array is:");
                size = sc.nextInt();
	   int [] arr = new int[size];
	  System.out.println("enter the elements of 1d array: ");
	  for(int i = 0;i < size;i++){
                  arr[i] = sc.nextInt();
              }
	}
}