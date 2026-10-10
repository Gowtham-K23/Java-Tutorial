import java.util.*;
public class HashMapExample
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("India", 331);
        map.put("USA", 332);
        map.put("China", 333);

        System.out.println("Population of India: " + map.get("India"));

        for(String x: map.keySet())
        {
            System.out.println(x);
        }

        map.put("USA", 330);

        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}