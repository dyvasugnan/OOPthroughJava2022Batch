import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if(isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;
        
        while(num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        
        return sum == originalNum;
  