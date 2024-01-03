import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        Boolean exit = false;
        do {
            mainMenu();
            choice = input.nextInt();// choice for main menu
            switch (choice) {
                case 1:
                    savingMenu(input);
                    break;
                case 2:
                    checkingMenu(input);
                    break;
                case 3:
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (!exit);
    }

    public static void mainMenu() {
        System.out.println("\nWelcome to ABC Bank");
        System.out.println("Bank Account");
        System.out.println("1. Saving Account");
        System.out.println("2. Checking Account");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void bankMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Check Balance");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static void savingMenu(Scanner input) {
        SavingAccount savingAccount = new SavingAccount(0);
        System.out.println("\nSaving Account");
        bankMenu();
        int choice;
        do {
            choice = 0;
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();// choice for bank menu
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: RM ");
                    double amount = input.nextDouble();
                    if (savingAccount.monthlyInterestDeposit(amount)) {
                        System.out.println("Deposit successfully");
                    } else {
                        System.out.println("Deposit failed");
                    }
                    break;
                case 2:
                    System.out.println("Your balance is: RM" + String.format("%.2f", savingAccount.getBalance()));
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: RM ");
                    amount = input.nextDouble();
                    if (savingAccount.withdraw(amount)) {
                        System.out.println("Withdraw successfully");
                    } else {
                        System.out.println("Withdraw failed, insufficient balance");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 4);

    }

    public static void checkingMenu(Scanner input) {
        CheckingAccount checkingAccount = new CheckingAccount(0);
        System.out.println("\nChecking Account");
        bankMenu();
        int choice;
        double amount;
        do {
            amount = 0;
            choice = 0;
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();// choice for bank menu
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: RM");
                    amount = input.nextDouble();
                    if (checkingAccount.deposit(amount)) {
                        System.out.println("Deposit successfully");
                    } else {
                        System.out.println("Deposit failed");
                    }
                    break;
                case 2:
                    System.out.println("Your balance is: RM" + String.format("%.2f", checkingAccount.getBalance()));
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: RM");
                    amount = input.nextDouble();
                    if (checkingAccount.withdraw(amount)) {
                        System.out.println("Withdraw successfully");
                    } else {
                        System.out.println("Issuing a check. Insufficient balance, RM10 fee charged to your account.");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }
}
