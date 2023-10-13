import java.util.Scanner;
public class StringSearch{
	public static int findstring(String[] array,String target){
		for(int i=0;i<array.length;i++)
			if(array[i].equals(target))
				return i;
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		String array[]=new String[size];
		System.out.println("enter target element");
		String target=sc.next();
		for(int j=0;j<size;j++)
			array[j]=sc.next();
		int result=findstring(array,target);
		if(result!=-1)
			System.out.println("stringfound at"+result);
		else
			System.out.println("string not found");
	}
}