public class OrderAmount
{
    double finalAmount;

    void calculateTotalAmount(Order order, double dis)
    {
        double discAmount = 0;
        int deliveryTax = 20;
        int applicationTax = 30;

        if(dis != 0)
        {
            discAmount = calculateDiscount(order.amount, dis);
        }

        finalAmount = discAmount + deliveryTax + applicationTax;
        order.finalAmount = finalAmount;
        return;
    }

    double calculateDiscount(double currAmount, double dis) {

        return (currAmount - (currAmount * dis / 100));
    }
}