public class Crypt
{
    public static int[] encrypt(String s)
    {

        int[] crypt= new int[s.length()]; //зашифрованный массив для возвращения
        crypt[0]= s.charAt(0); //сразу кладем в 0 элемент номер символа (от него мы отталкиваемся)

        for (int i=1; i<s.length(); ++i) //способ шифровки- текущий номер символа-предыдущий
        {
            crypt[i]=s.charAt(i)-s.charAt(i-1);
        }
        return crypt;
    }

    public static String decrypt (int[] mas)
    {
        String ans =""+ (char) mas[0]; //расшифрованная страка для возврата (сразу кладем туда первую букву)
        int current= mas[0]; //число первого символа (от него мы будем отталкиваться)

        for (int i=1; i< mas.length; ++i) //способ расшифровки- общая сумма пройденных элементов
        {
            current+=mas[i];
            ans+=(char) current;
        }
        return ans;
    }
}