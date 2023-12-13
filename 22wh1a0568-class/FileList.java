package LearningJava;
import java.io.File;
import java.util.Scanner;

public class FileList {
	public static void main(String[] args) {
		System.out.print("Enter Directory Name:");
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		File fd = new File(d);
		String[] arr = fd.list();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		File[] fdlist = new File[n];
		for(int i=0;i<n;i++) {
			fdlist[i] = new File(arr[i]);
			if(fdlist[i].isFile())
				System.out.print(arr[i] + "is a file");
			else
				System.out.print(arr[i] + "is a directory");
		}
		
	}

}
