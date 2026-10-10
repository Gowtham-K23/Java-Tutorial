import java.util.*;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        int[] arr = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Sorting to print numbers in sorted form
        // for(int i = 0; i < no - 1; i++)
        // {
        //     for(int j = i + 1; j < no; j++)
        //     {
        //         if(arr[i] > arr[j])
        //         {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        StringBuilder res = new StringBuilder();

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            res.append(entry.getKey())
                .append("-")
                .append(entry.getValue())
                .append(", ");
        }

        if(res.length() > 0)
        {
            res.setLength(res.length() - 2);
        }

        System.out.println(res.toString());
    }
}