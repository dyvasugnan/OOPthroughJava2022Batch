package LearningJava;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter elements:");
		for(int i = 0;i<size;i++) 
			array[i] = sc.nextInt();
		int target;
		System.out.print("Enter the target element:");
		target = sc.nextInt();
		for(int i = 0;i<size;i++) {
			int sum = 0;
			for(int j = i;j<size;j++) {
				sum += array[j];
				if(sum == target) {
					System.out.println("Subarray "+(i+1)+":");
					for(int k = i;k<=j;k++) {
						System.out.print(array[k]+" ");
					}
					System.out.print("\n");
				}
			}
		}
	}

}
