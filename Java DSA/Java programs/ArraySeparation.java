
import java.util.ArrayList;

public class ArraySeparation
{
    public static void main(String[] args) 
    {
        char[] arr1 = {'a', '%', 'd', '$', 'c', '^'};
        ArrayList<Character> x1 = new ArrayList<>();
        ArrayList<Character> x2 = new ArrayList<>();

        for(int i = 0; i < 6; i++)
        {
            char ch = arr1[i];
            if(Character.isLetter(ch))
            {
                x1.add(ch);
            }
            else
            {
                x2.add(ch);
            }
        }
        x1.addAll(x2);
        System.out.println(x1);
    }
}