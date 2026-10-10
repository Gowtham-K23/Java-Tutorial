import java.util.Arrays;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        List<OrderItem> items = Arrays.asList(
            new OrderItem("Pizza", 300, 2),
            new OrderItem("Burger", 150, 1)
        );

        Order order = new Order(items, 50);
        System.out.println("Total: " + order.calculateTotal());
    }    
}