import java.util.List;

public class Order 
{
    private List<OrderItem> items;
    private double deliveryFee;
    
    public Order(List<OrderItem> items, double deliveryFee) {
        this.items = items;
        this.deliveryFee = deliveryFee;
    }

    public double calculateTotal() {
        double subtotal = 0;

        for(OrderItem item : items) {
            subtotal += item.getTotalPrice();
        }

        return subtotal + deliveryFee;
    }
}