import java.util.Scanner;

class Sub_string {
    public static void main(String[] args) {
        int i;
        int[] numbers = {1, 4, 6, 3, 8, 5, 9, 6};
        int target;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target: ");
        target = sc.nextInt();
        int sum = 0;

        for (i = 0; i < numbers.length; i++){
            sum =0;
            for ( int j = i;j < numbers.length;j++){
                sum = sum + numbers[j];
                if (sum == target) {
                    for( int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " " );
                    }
                    System.out.println();
                }
            }
        }
    }
}
