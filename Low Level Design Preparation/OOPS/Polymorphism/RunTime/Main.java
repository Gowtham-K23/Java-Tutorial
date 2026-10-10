public class Main 
{
    public static void main(String[] args)
    {
        Subscription s1 = new Basic();
        s1.calculatePrice();

        Subscription s2 = new Premium();
        s2.calculatePrice();

        Subscription s3 = new Enterprise();
        s3.calculatePrice();
    }    
}
