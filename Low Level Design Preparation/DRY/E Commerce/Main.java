public class Main 
{
    public static void main(String[] args) 
    {
        Product prod1 = new Product("Laptop", 55000, 10);
        
        ShoppingSystem shop1 = new ShoppingSystem(prod1);
        shop1.createOrder(prod1);
        shop1.generateInvoice(prod1);
        shop1.processPayment(prod1);

        Product prod2 = new Product("Mobile Phone", 25000, 15);
        
        ShoppingSystem shop2 = new ShoppingSystem(prod2);
        shop2.createOrder(prod2);
        shop2.generateInvoice(prod2);
        shop2.processPayment(prod2);
    }    
}