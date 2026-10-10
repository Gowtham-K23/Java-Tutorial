import java.util.*;
public class Shares 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalShares = 0;
        int common = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            totalShares += arr[i];
        }

        common = totalShares / n;

        for(int i = 0; i < n; i++)
        {
            int diff = common - arr[i];
            if(diff > 0)
            {
                System.out.println("Person " + (i + 1) + " has to pay Rs." + Math.abs(diff));
            }
            else if(diff < 0)
            {
                System.out.println("Person " + (i + 1) + " receives Rs." + Math.abs(diff));
            }
            else
            {
                System.out.println("Person " + (i + 1) + " pays correctly");
            }
        }
    }    
}
