import java.util.Scanner;

class Solution {
    public boolean isHappy(int n) {
        int result = n;

        while (result != 1 && result != 4) {
            int sum = 0;
            int tempNum = result;

            while (tempNum != 0) {
                int rem = tempNum % 10;
                sum += rem * rem;
                tempNum /= 10;
            }

            result = sum;
        }

        return result == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        Solution solution = new Solution();
        boolean isHappy = solution.isHappy(n);

        System.out.println(solution.isHappy(n));
    }
}
