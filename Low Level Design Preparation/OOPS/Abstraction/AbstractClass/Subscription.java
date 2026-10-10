package AbstractClass;
// abstract class

abstract class Subscription
{
    private String name;

    // constructor

    Subscription(String name)
    {
        this.name = name;
    }

    // concrete methods - have implementation

    public void subscribe()
    {
        System.out.println(name + " subscribed successfully");
    }

    public void cancel()
    {
        System.out.println(name + " cancelled successfully");
    }

    // abstract methods - no implementation

    public abstract void calculate();

    public abstract void showBenefits();
}