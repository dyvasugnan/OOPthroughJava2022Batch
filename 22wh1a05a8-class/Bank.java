import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String args[]) {
        int win = 0;
        Scanner sc = new Scanner(System.in);
        UserBankAccount acc = new UserBankAccount(sc);
        while (true) {
            System.out.println("Select any of the following options");
            System.out.println("1 : Withdraw");
            System.out.println("2 : Deposit");
            System.out.println("3 : Check Balance");
            System.out.println("4 : Leave");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    acc.withdraw();
                    break;
                case 2:
                    acc.deposit();
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    System.out.println(".....Leaving.....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
class UserBankAccount{
    Scanner sc;
    int bankbalance;
    UserBankAccount(Scanner scanner) {
        this.sc = scanner;
        System.out.println("Enter the bank balance");
        bankbalance = sc.nextInt();
    }
    void withdraw() {
        System.out.println("Enter the amount to withdraw");
        int w = sc.nextInt();
        bankbalance = bankbalance - w;
    }
    void deposit() {
        System.out.println("Enter the amount to deposit");
        int d = sc.nextInt();
        bankbalance = bankbalance + d;
    }
    void checkBalance() {
        System.out.println("The bank balance is " + bankbalance);
    }
}
