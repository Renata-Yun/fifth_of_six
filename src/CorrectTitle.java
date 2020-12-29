import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CorrectTitle
{
    public static String title(String s)
    {
        String ans = "";
        String word = "";
        s = s.toLowerCase();
        String[] setter = {"and", "of", "in", "the"}; //предлоги
        Set<String> set = new HashSet<>();
        Collections.addAll(set, setter);

        for (int i = 0; i < s.length(); ++i)
        {
            if (Character.isLetter(s.charAt(i)))
                word += s.charAt(i);
            else
            {
                if (!set.contains(word) && word.length()>0)
                {
                    word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                }
                ans += word + s.charAt(i);
                word = "";
            }
        }
        return ans;
    }
}
