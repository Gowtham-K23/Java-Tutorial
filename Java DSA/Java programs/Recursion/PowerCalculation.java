public class PowerCalculation
{
    public static int power(int a, int b)
    {
        if(b == 0)
        {
            return 1;
        }
        else
        {
            return a * power(a, b - 1);
        }
    }
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;

        int powerValue = power(a, b);
        System.out.println("Power of " + a + " and " + b + " is: " + powerValue);
    }
}