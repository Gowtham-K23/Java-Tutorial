package AbstractClass;
class EnterpriseSubscription extends Subscription
{
    EnterpriseSubscription(String name)
    {
        super(name);
    }    

    @Override
    public void calculate()
    {
        System.out.println("The plan cost is Rs. 649");
    }

    @Override
    public void showBenefits()
    {
        System.out.println("Enterprise subscription benefits");
        System.out.println("1. 4 Devices support - Mobile, Laptop or TV \n2. 4k HD Video Quality \n3. Ads won't visible during Video Play");
    }
}
