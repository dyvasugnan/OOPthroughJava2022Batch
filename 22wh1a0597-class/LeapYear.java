import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(" is a leap year.");
        } else {
            System.out.println( " is not a leap year.");
        }
        
        scanner.close();
    }
}
