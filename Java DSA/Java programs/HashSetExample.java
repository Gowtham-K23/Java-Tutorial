import java.util.HashSet;
public class HashSetExample
{
    public static void main(String[] args) 
    {
        HashSet<String> x = new HashSet<>();
        
        x.add("Apple");
        x.add("Orange");
        x.add("Mango");
        x.add("Apple"); // duplicates will be  ignored

        System.out.println(x);

        System.out.println("Is Mango in the set? " + x.contains("Mango"));

        x.remove("Apple");

        System.out.println(x);

        for(String s : x)
        {
            System.out.println(s);
        }
    }
}