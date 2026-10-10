import java.util.*;

public class FormatNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        if(num < 1000)
        {
            System.out.println(num);
        }
        else if(num < 1_000_000)
        {
            formatNumber(num, 1_000, "k");
        }
        else if(num < 1_000_000_000)
        {
            formatNumber(num, 1_000_000, "M");
        }
        else
        {
            formatNumber(num, 1_000_000_000, "B");
        }
    }

    static void formatNumber(long num, long divisor, String suffix)
    {
        double value = (double) num / divisor;

        if(value == (long) value)
        {
            System.out.println((long) value + suffix);
        }
        else
        {
            System.out.printf("%.1f%s\n", value, suffix);
        }
    }
}