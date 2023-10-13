package LearningJava;

public class FibonacciSeries {

	public static void main(String[] args) {
		int terms = 13;
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series: " + n1 + "," + n2);
        for (int i = 2; i < terms; i++) {
            int next = n1 + n2;
            System.out.print("," + next);
            n1 = n2;
            n2 = next;
        }
	}

}
