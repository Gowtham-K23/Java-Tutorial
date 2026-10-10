import java.util.*;
public class Order
{
    int orderID;
    String cusName;
    String cusPhone;
    List<String> orderedItems;
    double amount;
    double finalAmount;

    Order(int orderID, String cusName, String cusPhone, List<String> orderedItems, double amount) {
        this.orderID = orderID;
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.orderedItems = orderedItems;
        this.amount = amount;
        this.finalAmount = 0;
    }
}