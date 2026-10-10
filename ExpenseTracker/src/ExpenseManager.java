// ExpenseManager.java
import java.io.*;
import java.util.*;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();
    private final String FILE_PATH = "data/expenses.txt";

    public ExpenseManager() {
        loadExpenses();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        saveExpenses();
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to show.");
            return;
        }
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void viewTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println("Total Expenses: Rs. " + total);
    }

    public void saveExpenses() {
        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs(); // ensure /data exists
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Expense e : expenses) {
                bw.write(e.toFileString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error saving expenses.");
        }
    }

    public void loadExpenses() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) return;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                expenses.add(Expense.fromFileString(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error loading expenses.");
        }
    }
}