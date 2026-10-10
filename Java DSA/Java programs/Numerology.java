import java.util.*;

public class Numerology {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int even_count = 0;
        int odd_count = 0;
        boolean firstPass = true;

        while (true) {
            int digit = n % 10;
            sum += digit;

            if (firstPass) {
                if (digit % 2 == 0)
                    even_count++;
                else
                    odd_count++;
            }

            n /= 10;

            if (n == 0) {
                if (firstPass) {
                    System.out.println("Sum of digits: " + sum);
                    System.out.println("Even count: " + even_count);
                    System.out.println("Odd count: " + odd_count);
                    firstPass = false; // So we don't count even/odd again
                }

                if (sum < 10) {
                    System.out.println("Numerology: " + sum);
                    break;
                } else {
                    n = sum;
                    sum = 0;
                }
            }
        }
    }
}
