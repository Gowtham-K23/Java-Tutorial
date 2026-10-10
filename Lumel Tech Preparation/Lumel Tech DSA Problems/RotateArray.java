import java.util.Scanner;
public class RotateArray 
{
    public static void rotate(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        d = d % n;

        rotate(arr, 0, d - 1);
        rotate(arr, d, n - 1);
        rotate(arr, 0, n - 1);

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    
}
