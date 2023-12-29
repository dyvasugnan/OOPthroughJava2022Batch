public class swap {
	public static void main (String[] args) {
		int a = 15,b = 25;
		int temp = 0;
		System.out.println("Before Swapping:");
		System.out.println("a= "+a +" b= "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping:");
		System.out.print("a= "+a +" b= "+b);
	}
}