import java.util.Arrays;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        
        List<OrderItem> items = Arrays.asList(
            new OrderItem("Dosa", 60, 5),
            new OrderItem("Poori", 55, 8)
        );

        Order order = new Order(items, 75);

        System.out.println("Total Price: " + order.calculateTotal());
    }    
}
