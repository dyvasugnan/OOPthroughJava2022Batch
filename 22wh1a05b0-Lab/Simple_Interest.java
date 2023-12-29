public class Simple_Interest {
	public static void main (String[] args) {
		int p = 50000;
		int t = 3;
		int r = 2;
		int SI = (p*t*r)/100;
		System.out.println("Principle amount: "+p);
		System.out.println("Time: "+t);
		System.out.println("Rate of Interest: "+r);
		System.out.print("Simple Interest is: "+SI);
	}
}