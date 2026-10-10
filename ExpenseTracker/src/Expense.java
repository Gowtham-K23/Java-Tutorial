import java.io.Serializable;

public class Expense implements Serializable
{
    private String date;
    private String category;
    private String description;
    private double amount;

    public Expense(String date, String category, String description, double amount)
    {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public String toString()
    {
        return date + " | " + category + " | " + description + " | Rs. " + amount;
    }

    public String toFileString()
    {
        return date + "," + category + "," + description + "," + amount;
    }

    public static Expense fromFileString(String line)
    {
        String[] parts = line.split(",");
        return new Expense(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]));
    }

    public double getAmount()
    {
        return amount;
    }
}