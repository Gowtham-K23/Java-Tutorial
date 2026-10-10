public class Main 
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer("Gowtham");
        Subscription s1 = new Subscription("Premium");

        s1.showSubscription(c1);
    }
}

// Association - relationship between two independent objects
// know / use relationship