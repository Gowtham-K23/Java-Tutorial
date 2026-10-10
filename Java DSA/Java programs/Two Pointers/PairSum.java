public class PairSum
{
    public static void main(String[] args)
    {
        // arr = {1, 2, 3, 4, 6}
        // target = 6
        // answer {1, 3} -> arr[1] = 2 and arr[3] = 4 -> 2 + 4 = 6
        // need to find the respected indices

        // int[] arr = {1, 2, 3, 7, 6};
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;
        int sum = 0;
        while(left < right)
        {
            sum = arr[left] + arr[right];
            if(sum == target)
            {
                System.out.println("indices are: " + left + " and " + right);
                break;
            }
            else if(sum > target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        if(sum != target)
        {
            System.out.println("indices are: " + -1 + " and " + -1);
            System.out.println("There are no pairs to get the sum which is equal to the target");
        }
    }
}