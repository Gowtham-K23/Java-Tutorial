import java.util.*;
public class Anagrams
{
    public static void main(String[] args) 
    {
        //Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "world";

        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();

        Arrays.sort(ss1);
        Arrays.sort(ss2);

        int temp = 1;

        if(ss1.length != ss2.length)
        {
            System.out.println("Not anagram");
        }
        else
        {
            for(int i = 0; i < ss1.length; i++)
            {
                if(ss1[i] != ss2[i])
                {
                    temp = -1;
                    break;
                }
            }
            if(temp == 1)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not anagram");
            }
        }
    }
}