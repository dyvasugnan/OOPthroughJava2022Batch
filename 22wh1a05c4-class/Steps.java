import java.io.*;

class Steps {
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int countingsteps() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("enter no.of steps:");
        String s = br.readLine();
        int no_of_steps = Integer.parseInt(s);
        if (no_of_steps <= 1) {
            return 1;
        } else {
            int output = fibonacci(no_of_steps - 2) + fibonacci(no_of_steps - 1);
            return output;
        }
    }
    public static void main(String[] args) throws IOException {
        int result = countingsteps();
        System.out.print("no.of ways:" + result );
    }
}