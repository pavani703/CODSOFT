package Codsoft;
import java.util.Scanner;
public class ATMInterface {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create sample user account
            BankAccount account = new BankAccount("Pavani", 1234, 10000.0);

            System.out.println("💳✨ Welcome to CodSoft ATM ✨💳");

            // PIN Verification
            System.out.print("🔐 Enter your 4-digit PIN: ");
            int inputPin = scanner.nextInt();

            if (!account.verifyPin(inputPin)) {
                System.out.println("❌ Incorrect PIN. Access Denied. 🔒");
                return;
            }

            int choice;
            do {
                System.out.println("\n===============================");
                System.out.println("🏧  CodSoft ATM Main Menu  🏧");
                System.out.println("===============================");
                System.out.println("1️⃣  Check Balance");
                System.out.println("2️⃣  Deposit Money");
                System.out.println("3️⃣  Withdraw Money");
                System.out.println("4️⃣  View Transaction History");
                System.out.println("5️⃣  Exit");
                System.out.print("👉 Choose an option (1-5): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("💰 Your Current Balance is: ₹" + account.getBalance());
                        break;
                    case 2:
                        System.out.print("💵 Enter amount to deposit: ₹");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("💸 Enter amount to withdraw: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("📜 Here's your transaction history:");
                        account.showTransactionHistory();
                        break;
                    case 5:
                        System.out.println("👋 Thank you for banking with CodSoft ATM. See you again! 🔒");
                        break;
                    default:
                        System.out.println("⚠️ Oops! Invalid option. Please select between 1-5.");
                }
            } while (choice != 5);

            scanner.close();
        }
}