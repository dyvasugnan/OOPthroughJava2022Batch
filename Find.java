import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 3, 8};
        int target;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the target: ");
        target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target " + target + " is found.");
        } else {
            System.out.println("Target " + target + " is not found in the array.");
        }

        sc.close();
    }
}

