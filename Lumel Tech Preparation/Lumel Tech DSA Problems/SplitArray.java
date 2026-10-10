import java.util.*;
public class SplitArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = {1, 2, null, 3, 4, null, 6, 7, null, null, 8, null, 9};

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        for(Integer num : arr)
        {
            if(num == null)
            {
                if(!current.isEmpty())
                {
                    result.add(new ArrayList<>(current));
                    current.clear();
                }
            }
            else
            {
                current.add(num);
            }
        }

        if(!current.isEmpty())
        {
            result.add(current);
        }

        System.out.println(result);
    }    
}
