public class ReverseString
{
    static String reverse(String s1)
    {
        if(s1.isEmpty())
        {
            return s1;
        }
        return reverse(s1.substring(1)) + s1.charAt(0);
    }
    public static void main(String[] args)
    {
        String s = "hello";
        System.out.println("Reversed String: " + reverse(s));
    }
}