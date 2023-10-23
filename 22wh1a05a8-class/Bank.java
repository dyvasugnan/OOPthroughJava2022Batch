import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String args[]) {
        int win = 0;
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm(sc);
        UserBankAccount acc = new UserBankAccount(atm);
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
class Atm {
    Scanner sc;
    int bankbalance;

    public Atm(Scanner scanner) {
        this.sc = scanner;
        System.out.println("Enter the bank balance");
        bankbalance = sc.nextInt();
    }
}
class UserBankAccount {
    Atm atm;
    public UserBankAccount(Atm atm) {
        this.atm = atm;
    }
    void withdraw() {
        System.out.println("Enter the amount to withdraw");
        int w = atm.sc.nextInt();
        atm.bankbalance = atm.bankbalance - w;
    }
    void deposit() {
        System.out.println("Enter the amount to deposit");
        int d = atm.sc.nextInt();
        atm.bankbalance = atm.bankbalance + d;
    }
    void checkBalance() {
        System.out.println("The bank balance is " + atm.bankbalance);
    }
}
