public class BitExampleKaar
{
    public static void main(String[] args) 
    {
        int arr[] = {7, 7, 7};
        
        int n2 = arr.length / 2;
        int n1 = arr.length - n2;

        int value1 = arr[0];
        for(int i = 1; i < n1; i++)
        {
            value1 = value1 | arr[i];
        }

        int value2 = arr[n1];
        for(int i = n1; i < arr.length; i++)
        {
            value2 = value2 | arr[i];
        }

        int value3 = value1 ^ value2;

        System.out.println(value3);
    }
}