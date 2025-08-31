import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        int choice;

        do {
            System.out.println("\n===== Bank Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    if (account != null) {
                        System.out.println("Account already exists.");
                        break;
                    }
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    account = new BankAccount(name, accNum);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    account.checkBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using our services!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
