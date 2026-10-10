package AbstractClass;
class PremiumSubscription extends Subscription
{
    PremiumSubscription(String name)
    {
        super(name);
    }    

    @Override
    public void calculate()
    {
        System.out.println("The plan cost is Rs. 499");
    }

    @Override
    public void showBenefits()
    {
        System.out.println("Premium subscription benefits");
        System.out.println("1. 2 Devices support - Mobile, Laptop or TV \n2. 1080p HD Video Quality \n3. Ads Visible during Video Play");
    }
}
