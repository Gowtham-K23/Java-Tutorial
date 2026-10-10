public class CountZeroes
{
    public static int count(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            int rem = n % 10;
            return ((rem == 0) ? 1 : 0) + count(n / 10);
        }
    }
    public static void main(String[] args) 
    {
        int n = 102030;
        int c = count(n);
        System.out.println("Number of 0's in " + n + " is: " + c);    
    }
}