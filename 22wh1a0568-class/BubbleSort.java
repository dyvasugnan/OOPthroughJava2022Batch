package LearningJava;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		n = sc.nextInt();
		int temp;
		int array[] = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0;i<n;i++) 
			array[i] = sc.nextInt();
	    for(int i = 0;i<n-1;i++) {
	    	for(int j = 0;j<n-1-i;j++) {
	    		if(array[j]>array[j+1]) {
	    			temp = array[j];
	    			array[j] = array[j+1];
	    			array[j+1] = temp;
	    		}
	    	}
	    }
	    System.out.println("Sorted Array:");
	    for(int i = 0;i<n;i++) 
	    	System.out.println(array[i]);
	}
}
