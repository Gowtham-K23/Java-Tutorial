public class Main 
{
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat();
        Flyable flying = new Sparrow();
        flying.fly();

        System.out.println();

        Bird penguin = new Bird();
        penguin.eat();
        
        Penguin p = new Penguin();
        p.swim();
    }    
}