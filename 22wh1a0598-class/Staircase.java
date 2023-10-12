public class Main {
    public static int climbStairs(int n) {
        int[] steps = new int[n + 1];

        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            steps[0] = 1;
            steps[1] = 1;
            for (int i = 2; i <= n; i++) {
                steps[i] = steps[i - 2] + steps[i - 1];
            }
            return steps[n];
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
