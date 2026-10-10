public class Animal
{
    public void sound()
    {
        System.out.println("Animal makes sound...");
    }
}

class Dog extends Animal
{
    public void sound()
    {
        super.sound();
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal
{
    public void sound()
    {
        super.sound();
        System.out.println("Cat Meows");
    }
}