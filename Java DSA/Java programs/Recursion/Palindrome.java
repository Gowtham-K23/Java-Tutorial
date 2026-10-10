public class Palindrome
{
    static boolean palindrome(String s, int start, int end)
    {
        if(start >= end)
        {
            return true;
        }
        else if(s.charAt(start) != s.charAt(end))
        {
            return false;
        }
        else
        {
            return palindrome(s, start + 1, end - 1);
        }
    }
    public static void main(String[] args) 
    {
        String s1 = "madam";
        boolean x = palindrome(s1, 0, s1.length()-1);     
        System.out.println(x);
    }
}