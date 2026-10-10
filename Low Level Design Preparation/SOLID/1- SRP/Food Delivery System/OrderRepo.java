public class OrderRepo
{
    void save(Order order)
    {
        System.out.println("Order ID: " + order.orderID);
        System.out.println("Customer Name: " + order.cusName);
        System.out.println("Customer Phone: " + order.cusPhone);
        System.out.println("Order Items: ");
        for(String item : order.orderedItems) {
            System.out.println("-> " + item);
        }
        System.out.println("Order Amount: " + order.amount);
        System.out.println("Final Payable Amount: " + order.finalAmount);
        System.out.println();
        System.out.println("Saving to Database...");
        System.out.println("Saved successfully...");
        System.out.println();
    }
}