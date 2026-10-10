import java.util.*;
public class StringPatterns 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    

        String pattern = sc.nextLine();
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        if(pattern.length() != words.length)
        {
            System.out.println("False");
            return;
        }

        for(int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(ch))
            {
                if(!charToWord.get(ch).equals(word))
                {
                    System.out.println("False");
                    return;
                }
            }
            else
            {
                charToWord.put(ch, word);
            }

            if(wordToChar.containsKey(word))
            {
                if(wordToChar.get(word) != ch)
                {
                    System.out.println("False");
                    return;
                }
            }
            else
            {
                wordToChar.put(word, ch);
            }
        }

        System.out.println("True");
        return;
    }    
}
