abstract class Animal
{
    abstract void sound();

    void sleep()
    {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Barks");
    }
}