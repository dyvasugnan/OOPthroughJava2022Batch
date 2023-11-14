import java.util.*;
class Minimize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elemnts: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            while (nums[i] > nums[i - 1]) {
                nums[i]--;
                nums[i - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        System.out.println("the minimum possible max elemnt:");
        System.out.println(max);
    }
}
