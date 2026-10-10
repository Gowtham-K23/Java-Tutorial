package AbstractClass;
class BasicSubscription extends Subscription
{
    BasicSubscription(String name)
    {
        super(name);
    }

    @Override
    public void calculate()
    {
        System.out.println("The plan cost is Rs. 299");
    }

    @Override
    public void showBenefits()
    {
        System.out.println("Basic subscription benefits");
        System.out.println("1. 1 Device support - only mobile \n2. 720p HD Video Quality \n3. Ads Visible during Video Play");
    }
}