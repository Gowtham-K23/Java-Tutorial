public class ShoppingSystem 
{
    private final int FIXED_TAX = 18;
    private Product product;
    
    public ShoppingSystem(Product product)
    {
        this.product = product;
    }

    public double calculateAmount(Product product)
    {
        double subTotal = product.getPrice() * product.getQuantity();
        double tax = subTotal * FIXED_TAX / 100;
        return subTotal + tax;
    }

    public void createOrder(Product product)
    {
        double finalAmount = calculateAmount(product);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Order created...\n");
        return ;
    }

    public void generateInvoice(Product product)
    {
        double finalAmount = calculateAmount(product);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Invoice generated...\n");
        return ;
    }

    public void processPayment(Product product)
    {
        double finalAmount = calculateAmount(product);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Payment processed...\n");
        return ;
    }
}