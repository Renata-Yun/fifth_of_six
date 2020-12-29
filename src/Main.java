import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int x;
        int[] mas;
        String s1;
        String s2;
        String s3;
        ArrayList<String> set=new ArrayList<>();

        //1.1
        System.out.println("Программа №1.1 - Шифрование секретного сообщения");
        System.out.println("введите слово для шифровки");
        s1=scanner.nextLine();
        mas= new int[s1.length()];
        mas=Crypt.encrypt(s1);
        for (int i : mas)
            System.out.print(i+ " ");
        System.out.println();

        //1.2
        System.out.println("Программа №1.2 - Дешифрование секретного сообщения");
        System.out.println("Введите кол-во элементов массива слова для дешифровки");
        x=scanner.nextInt();
        System.out.println("Введите элементы массива");
        mas= new int[x];
        for (int i=0; i<mas.length; ++i)
            mas[i]=scanner.nextInt();
        System.out.println(Crypt.decrypt(mas));

        //2
        System.out.println("Программа №2 - Шахматы");
        System.out.println("Введите фигуру");
        s1=scanner.nextLine();
        s1=scanner.nextLine();
        System.out.println("Введите начальную позицию");
        s2=scanner.nextLine();
        System.out.println("Введите конечную позицию");
        s3=scanner.nextLine();
        System.out.println(CanMove.chess(s1,s2,s3));

        //3
        System.out.println("Программа №3 - Части слов от слова");
        System.out.println("Введите незавершенную строку");
        s1=scanner.nextLine();
        System.out.println("Введите нужную строку");
        s2=scanner.nextLine();
        System.out.println(CanComplete.string(s1,s2));

        //4
        System.out.println("Программа №4 - Произведение цифр");
        System.out.println("Введите кол-во чисел");
        x=scanner.nextInt();
        mas=new int[x];
        System.out.println("Введите числа посимвольно");

        for (int i=0; i<mas.length; ++i)
            mas[i]=scanner.nextInt();
        System.out.println(SumDigProd.multiply(mas));

        //5
        System.out.println("Программа №5 - Гласные в словах");
        System.out.println("Введите кол-во слов");
        x=scanner.nextInt();
        System.out.println("Введите слова посимвольно");
        for (int i=0; i<=x; ++i)
            set.add(scanner.nextLine());

        set.remove("");
        set=SameVowelGroup.group(set);

        for (String i: set)
            System.out.print(i+" ");
        System.out.println();

        //6
        System.out.println("Программа №6 - Кредитные карты");
        System.out.println("Введите номер карты");
        s1=scanner.nextLine();
        System.out.println(ValidateCard.card(s1));


        //7
        System.out.println("Программа №7 - Числа, написанные словами");
        System.out.println("Введите число от 0 до 999");
        s1=scanner.nextLine();
        System.out.println(NumTo.eng(s1));

        //8
        System.out.println("Программа №8 - Безопасный хеш SHA-256");
        System.out.println("Введите строку");
        s1=scanner.nextLine();
        System.out.println(ToSHA256hex.sha(s1));

        //9
        System.out.println("Программа №9 - Правильные регистры");
        System.out.println("Введите строку");
        s1=scanner.nextLine();
        System.out.println(CorrectTitle.title(s1));

        //10
        System.out.println("Программа №10 - Гексагональная решетка");
        System.out.println("Ведите число");
        x=scanner.nextInt();
        System.out.println(HexLattice.hex(x));
    }
}

