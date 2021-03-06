public class HexLattice
{
    public static String hex(int x)
    {
        int max=1; //переменная для обозначения максимального кол-ва кружочков
        int min=1; //для минимального
        int i=1; //проверочная переменная, для сравнения, сможем ли мы создать такой рисунок
        int sum=6; //сумма шагов до следующего рисунка
        int spaces=0; //кол-во пробелов для перед рисованием
        String ans="";
        char ch='o';
        char space=' ';
        boolean reverse=false; //флаг для смены действия в дальнейшем

        while (i<x) //ищем ближайшее возможное число, при котором можем рисовать
        {
            i+=sum; //делаем шаг
            sum=(6*min)+6; //инициализируем следующий
            max+=2; //прибавляем к максимальной строке кружочков 2
            min++; //к минимальной 1
        }
        if (i==x) //если существует
        {
            spaces=min; //инициализируем число пробелов перед рисунком
            for (i=0; i<max; ++i) //начинаем рисовать (max отвечает и за максимальную строку кружочков, и за кол-во строк)
            {
                for (int j=0; j<spaces; ++j) //ставим пробелы для рисунка
                    ans+=space;
                for (int j=0; j<min; ++j) //рисуем кружочки
                {
                    ans+=ch;
                    ans+=space;
                }
                if ((max-1)/2 ==i) //если нарисовали самую большую строку кружочков (центральную) меняем действие с кол-вом пробелаов и кружочков
                    reverse=!reverse;
                min= reverse? --min: ++min; //тернарный оператор нужного действия с кружочками
                spaces= reverse? ++spaces: --spaces; //с пробелами
                ans+='\n'; //перескакиваем на след строку
            }
        }
        return ans;
    }
}