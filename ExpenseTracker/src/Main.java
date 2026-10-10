// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    System.out.print("Enter category (Food, Travel, etc.): ");
                    String category = sc.nextLine();
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    manager.addExpense(new Expense(date, category, desc, amount));
                    System.out.println("Expense added!");
                    break;

                case 2:
                    System.out.println("----- Your Expenses -----");
                    manager.viewExpenses();
                    break;

                case 3:
                    manager.viewTotal();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}