// Class Creation
public class Car
{
    // Attributes

    private String name;
    private String color;
    private int year;

    // Constructor

    Car(String name, String color, int year)
    {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    // Methods (Behaviors)

    public void getDetails()
    {
        System.out.println("Car: " + name + "\nColor: " + color + "\nYear: " + year);
        System.out.println();
    }

    // Main Method
    public static void main(String[] args)
    {
        // Object creation

        Car c1 = new Car("BMW", "Blue", 2020);
        Car c2 = new Car("Mercedes Benz", "Black", 2018);

        // Calling methods with objects
        
        c1.getDetails();
        c2.getDetails();
    }
}