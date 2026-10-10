public class ReverseString
{
    public static void main(String[] args) 
    {
        String word = "Lumel Tech";
        
        StringBuilder result = new StringBuilder();

        for(int i = word.length() - 1; i >= 0; i--)
        {
            result.append(word.charAt(i));
        }

        System.out.println(result.toString());
    }
}