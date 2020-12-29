public class CanComplete
{
    public static boolean string(String s, String str)
    {
        int index = 0; //индекс нахождения символа (он всегда должен повышаться)
        boolean ans = true;
        boolean[] mas = new boolean[str.length()]; //массив, использовали ли мы букву в строке

        for (int i = 0; i < s.length(); ++i) //проверяем нахождение этих символов
        {
            for (int j = 0; j < str.length(); ++j) //в этой строке
            {
                {
                    if (s.charAt(i) == str.charAt(j)) //если нашли совпадение символов
                    {
                        if (index <= j) //и индекс идет на повышение (при 0 на не убывание)
                            if (!mas[j]) //если букву в строке не отмечали, как отмеченную
                            {
                                index = j; //отмечаем найденное индексом нахождения
                                mas[j] = true; //и то, что мы ее использовали
                            }
                            else
                                ans = false; //если индекс идет на убывание, отмечаем провал и выходим
                        break; //в обоих случаях нет смысла бежать по строке дальше
                    }
                    else if (j == str.length() - 1 && s.charAt(i) != str.charAt(j)) //если последний символ строки не то, что нам надо, отмечаем провал и выходим
                    {
                        ans = false;
                        break;
                    }
                }
            }
            if (!ans) //если уже нашли провал, выходим
                break;
        }
        return ans;
    }
}
