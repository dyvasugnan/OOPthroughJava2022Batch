class SwapNumbers{
    int a;
    int b;
    public SwapNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void swapNumbers() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
    public void printNumbers() {
        System.out.println("Number a: " + a);
        System.out.println("Number b: " + b);
    }
}
public class SwapNumbers{
    public static void main(String[] args) {
        SwapNumber = new SwapNumber(2,5);
        System.out.println("Before swapping:");
        SwapNumber.printNumbers();
        System.out.println("After swapping:");
        SwapNumber.printNumbers();
    }
}