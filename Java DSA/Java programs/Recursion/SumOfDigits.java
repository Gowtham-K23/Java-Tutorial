public class SumOfDigits
{
    public static int sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return (n % 10) + sum(n / 10);
        }
    }
    public static void main(String[] args)
    {
        int n = 1234;
        int s = sum(n);
        System.out.println("Sum of " + n + " is: " + s);
    }
}