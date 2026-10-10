public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();

        s.setName("Gowtham");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}