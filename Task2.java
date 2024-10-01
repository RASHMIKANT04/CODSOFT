import java.util.Scanner;

public class Task2 {
    class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                return false;
            } else {
                balance -= amount;
                return true;
            }
        }
    }

    class ATM {
        private BankAccount account;
        private Scanner scanner;

        public ATM(BankAccount account) {
            this.account = account;
            scanner = new Scanner(System.in);
        }

        public void start() {
            while (true) {
                System.out.println("ATM Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        withdraw();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

        private void withdraw() {
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        private void deposit() {
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit successful.");
        }

        private void checkBalance() {
            System.out.println("Current balance: $" + account.getBalance());
        }
    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        BankAccount account = task.new BankAccount(1000); 
        
        ATM atm = task.new ATM(account);
        atm.start();
    }
}
