import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        List<String> orderedItems = new ArrayList<>();
        orderedItems.add("Pizza");
        orderedItems.add("Burger");

        Order order = new Order(14336, "Bala", "6380656652", orderedItems, 585);

        OrderAmount orderAmount = new OrderAmount();
        orderAmount.calculateTotalAmount(order, 10.0);

        OrderRepo orderRepo = new OrderRepo();
        orderRepo.save(order);

        EmailConfirm confirm = new EmailConfirm();
        confirm.email(order);

        PdfGeneration pdf = new PdfGeneration();
        pdf.pdfGenerate(order);

    }
}