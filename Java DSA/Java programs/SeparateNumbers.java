public class SeparateNumbers
{
    public static void main(String[] args)
    {
        int num = 123456789;

        int n1 = 0;
        int n2 = 0;

        int mul1 = 1;
        int mul2 = 1;

        while(num > 0)
        {
            int rem = num % 10;

            if(rem % 2 != 0)
            {
                n1 = n1 + (rem * mul1);
                mul1 = mul1 * 10;
            }
            else
            {
                n2 = n2 + (rem * mul2);
                mul2 = mul2 * 10;
            }
            num = num / 10;
        }
        System.out.println(n1);
        System.out.println(n2);
    }
}