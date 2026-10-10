public class VariableSizeWindow
{
    public static void main(String[] args)
    {
        //Find Minimum length of subarray with sum >= target
        //input: arr[] = {2, 3, 1, 2, 4, 3}
        //target: 7
        //answer: 2 because [4, 3]

        int[] nums = {2, 3, 1, 2, 4, 3};
        int start = 0;
        int sum = 0;
        int target = 7;
        int minLen = Integer.MAX_VALUE;

        for(int end = 0; end < nums.length; end++)
        {
            sum += nums[end];

            while(sum >= target)
            {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start++];
            }
        }
        if(minLen == Integer.MAX_VALUE)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(minLen);
        }
    }
}