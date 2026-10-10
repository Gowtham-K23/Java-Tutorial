package AbstractClass;
public class Main 
{
    public static void main(String[] args)
    {
        Subscription s1 = new BasicSubscription("Gowtham");
        s1.subscribe();
        s1.calculate();
        s1.showBenefits();

        System.out.println();

        Subscription s2 = new PremiumSubscription("Bala");
        s2.subscribe();
        s2.calculate();
        s2.showBenefits();
        s2.cancel();

        System.out.println();

        Subscription s3 = new EnterpriseSubscription("Amutha");
        s3.subscribe();
        s3.calculate();
        s3.showBenefits();
    }    
}
