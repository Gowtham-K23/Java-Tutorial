import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDuplicates
{
    public static void main(String[] args) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        int[] numArray = {2, 3, 4, 5, 2, 4, 3, 1, 7, 8, 1, 1, 1, 10, 11};

        for(int n: numArray)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(HashMap.Entry<Integer, Integer> entry: map.entrySet())
        {
            int y = entry.getKey();
            int z = entry.getValue();

            if(z > 1)
            {
                arr.add(y);
            }
        }

        System.out.print(arr);
    }
}