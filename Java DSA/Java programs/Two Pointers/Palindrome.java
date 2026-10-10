public class Palindrome
{
    public static void main(String[] args) 
    {
        String s = "madam";
        // String s = "forensic";
        int left = 0;
        int right = s.length() - 1;
        int temp = 1;
        s = s.toLowerCase();
        while(left <= right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                temp = 0;
                break;
            }
            else
            {
                left++;
                right--;
            }
        }
        if(temp == 0)
        {
            System.out.println(s + " is not a Palindrome");
        }
        else
        {
            System.out.println(s + " is a Palindrome");
        }
    }
}