import java.util.*;
public class OneD_To_TwoD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[][] res = new int[size / 2][size / 2];
        Arrays.sort(arr);
        int index = 0;

        for(int i = 0; i < size / 2; i++)
        {
            for(int j = 0; j < size / 2; j++)
            {
                res[i][j] = arr[index++];
            }
        }

        System.out.println("Resultant Array: \n");
        for(int i = 0; i < size / 2; i++)
        {
            for(int j = 0; j < size / 2; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
