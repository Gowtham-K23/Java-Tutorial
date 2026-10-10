public class SumOfNumbers
{
    public static int sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return n + sum(n - 1);
        }
    }
    public static void main(String[] args) 
    {
        int n = 5;
        int s = sum(n);
        System.out.println("Sum of " + n + " numbers is: " + s);    
    }
}