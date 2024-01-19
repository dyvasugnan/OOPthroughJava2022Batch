import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                    
                }
            }
        }
        //No element is found
        return new int[]{};  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int target = sc.nextInt();
        int i,j;
        for (i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int[] result=solution.twoSum(nums, target);
        if(result.length==2){
            System.out.println(result[0]+" "+result[1]);
        }
        else{
             System.out.println("No pairs are found");
        }
    }
}
