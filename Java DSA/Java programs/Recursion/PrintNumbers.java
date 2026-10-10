public class PrintNumbers
{
    public static int print(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            System.out.println(n);
            print(n - 1);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int n = 5;
        print(n);
    }
}