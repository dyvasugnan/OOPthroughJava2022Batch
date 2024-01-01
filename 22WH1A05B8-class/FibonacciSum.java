public class FibonacciSum {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int sum = 0;

        while (second <= 4000000) {
            int temp = first + second;
            if (temp % 2 == 0 && temp <= 4000000) {
                sum += temp;
            }
            first = second;
            second = temp;
        }

        System.out.println("The sum of the even-valued terms in the Fibonacci sequence not exceeding four million is: " + sum);
    }
}
