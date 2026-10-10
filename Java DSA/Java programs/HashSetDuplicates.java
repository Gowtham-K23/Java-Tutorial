import java.util.HashSet;
public class HashSetDuplicates
{
    public static void main(String[] args) 
    {
        HashSet<Integer> x = new HashSet<>(); 
        int[] arr = {2, 3, 4, 5, 1, 2, 4, 5, 6, 7, 8, 7, 4, 2};
        
        for(int n: arr)
        {
            if(!x.contains(n))
            {
                x.add(n);
            }
        }
        System.out.println(x);
    }
}

// Removing Duplicates - Not finding the element that have duplicates - just removing the duplicate values