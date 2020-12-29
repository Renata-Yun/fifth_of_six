import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SameVowelGroup
{
    public static ArrayList<String> group(ArrayList<String> set)
    {
        String letters = "aeiouyаеёиоуыэюя";
        String word = "";
        Set<Character> word1= new HashSet<>();
        Set<Character> word2= new HashSet<>();
        boolean done = true;
        boolean first = true;
        ArrayList<String> ans= new ArrayList<>();

        for (String current : set)
        {
            if (first) //вбиваем все буквы первого слова в эталонную коллекцию и добавляем его в финальную коллекцию
            {
                for (int i=0; i<current.length(); ++i)
                {
                    for (int j = 0; j < letters.length(); ++j)
                        if (current.charAt(i) == letters.charAt(j))
                            word1.add(current.charAt(i));
                }

                ans.add(current);
                first=false;
            }
            else
            { //все то же проделываем с последующими словами и сравниваем коллекции
                for (int i=0; i<current.length();++i)
                {
                    for (int j = 0; j < letters.length(); ++j)
                        if (current.charAt(i) == letters.charAt(j))
                            word2.add(current.charAt(i));
                }

                if (word1.equals(word2)) //если совпадают, то добавляем слово в вывод
                    ans.add(current);
                word2.clear();
            }
        }
        return ans;
    }
}
