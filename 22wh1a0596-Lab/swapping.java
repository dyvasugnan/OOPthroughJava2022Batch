import java.util.Scanner;
class swap{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter first number:");
		int x = obj.nextInt();
		System.out.println("enter second number:");
		int y = obj.nextInt();
		int temp = x;
		x = y;
		y = temp;
		System.out.println("after swapping:" + x );
		System.out.println("after swapping:" + y );
	}
}