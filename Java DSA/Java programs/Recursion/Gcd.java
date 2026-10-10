public class Gcd
{
    public static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) 
    {
        int a = 48;
        int b = 18;
        
        int ans = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + ans);
    }
}