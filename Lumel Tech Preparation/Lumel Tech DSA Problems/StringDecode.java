import java.util.*;
public class StringDecode 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(map.get(ch) == 1)
            {
                res.append("(");
            }
            else
            {
                res.append(")");
            }
        }
        System.out.println(res.toString());
    }    
}
