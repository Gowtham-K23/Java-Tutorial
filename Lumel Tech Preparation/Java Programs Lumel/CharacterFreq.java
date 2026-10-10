import java.util.*;

public class CharacterFreq 
{
    public static void main(String[] args) 
    {
        String word = "apple".toLowerCase();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : word.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(HashMap.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }    
}
