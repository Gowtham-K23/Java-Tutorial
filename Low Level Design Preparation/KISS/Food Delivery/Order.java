import java.util.List;

public class Order 
{
    private List<OrderItem> items;
    private double deliveryFee;
    
    public Order(List<OrderItem> items, double deliveryFee) {
        this.items = items;
        this.deliveryFee = deliveryFee;
    }

    double calculateTotal() {
        double subTotal = 0;

        for(OrderItem item : items) {
            subTotal += item.getTotal();
        }

        return subTotal + deliveryFee;
    }
}