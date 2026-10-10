public class HappyNumber
{
    public static void main(String[] args)
    {
        int N = 19;

        int slow = N;
        int fast = getSquareSum(N);

        while(fast != 1 && slow != fast)
        {
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
        }
        
        if(fast == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not a Happy Number");
        }
    }

    public static int getSquareSum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}