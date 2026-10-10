public class SecondLargest 
{
    public static void main(String[] args) 
    {
        int[] nums = {20, 30, 55, 43, 66, 78};
        
        int maxi = 0;
        int second = 0;

        for(int num : nums)
        {
            if(num > maxi)
            {
                second = maxi;
                maxi = num;
            }
            else if(num >= second && num < maxi)
            {
                second = maxi;
            }
        }

        System.out.println(second);
    }
}
