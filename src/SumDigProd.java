public class SumDigProd
{
    public static int multiply(int[] mas)
    {
        int sum = 0; //переменная для проведения действий
        int mult = 1; //переменная для перемножения чисел и возврата
        boolean done = false;

        for (int i : mas) //складываем введеные числа
            sum += i;

        if (sum == 0) //если нам дали только нули
            return 0;
        else
        {
            while (!done) //пока не закончим функцию
            {
                while (sum != 0) //пока не перемножим все цифры числа
                {
                    mult *= sum % 10;
                    sum /= 10;
                }
                if (mult >= 10) //если осталось более 1 цифры в числе, идем по кругу
                {
                    sum = mult;
                    mult = 1;
                }
                else //иначе завершаем цикл и возвращаем найденную цифру
                    done = true;
            }
            return mult;
        }
    }
}
