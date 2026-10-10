import java.util.ArrayList;

public class DuplicatesArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 6, 3, 5, 6, 7, 2, 4, 9, 7, 0};
        
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr)
        {
            if(result.contains(num))
            {
                continue;
            }
            else
            {
                result.add(num);
            }
        }

        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
        {
            res[i] = result.get(i);
            System.out.print(res[i] + " ");
        }
    }    
}
