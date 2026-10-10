import java.util.HashSet;

public class LongestSubstring
{
    public static void main(String[] args)
    {
        //Variable size window
        //input - s = "abcabcbb"
        //output - 3 [abc]

        HashSet<Character> set = new HashSet<>();
        String s = "abcabcbb";
        int left = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }
}