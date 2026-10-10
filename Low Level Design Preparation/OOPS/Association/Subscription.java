public class Subscription 
{
    private String plan;
    
    Subscription(String plan)
    {
        this.plan = plan;
    }

    public void showSubscription(Customer c)
    {
        System.out.println("Customer Name: " + c.getName());
        System.out.println("The plan selected: " + plan);
    }
}