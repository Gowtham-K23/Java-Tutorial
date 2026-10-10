public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Animal a = new Dog();");
        Animal a = new Dog();
        a.sound();

        System.out.println();

        System.out.println("Animal a = new Cat();");
        Animal b = new Cat();
        b.sound();

        System.out.println();

        System.out.println("Dog D = new Dog();");
        Dog D = new Dog();
        D.sound();

        System.out.println();

        System.out.println("Cat C = new Cat();");
        Cat C = new Cat();
        C.sound();
    }
}