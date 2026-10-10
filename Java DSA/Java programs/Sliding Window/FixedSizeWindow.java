public class FixedSizeWindow
{
    public static void main(String[] args)
    {
        //Maximum sum of subarray size k
        //input - [2, 1, 5, 1, 3, 2]
        //k = 3
        //answer = 9

        int[] nums = {2, 1, 5, 1, 3, 2};
        int i;
        int k = 3;
        int sum = 0;
        int maxSum = 0;

        for(i = 0; i < k; i++)
        {
            sum += nums[i];
        }

        maxSum = sum;
        for(i = k; i < nums.length; i++)
        {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);
    }
}