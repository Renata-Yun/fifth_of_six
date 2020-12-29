public class CanMove
{
    public static boolean chess(String figure, String startPos, String endPos)
    {
        figure=figure.toLowerCase(); //спускаем
        startPos=startPos.toLowerCase(); //чтобы разница между соседними буквами и цифрами была в один знак
        endPos=endPos.toLowerCase();

        boolean ans=false;
        int firstState=Math.abs(startPos.charAt(0)-endPos.charAt(0)); //проверяем смещение по горизонтали
        int secondState=Math.abs(startPos.charAt(1)-endPos.charAt(1)); //по вертикали
        boolean oneDirectStates=(Math.abs(firstState)==Math.abs(secondState)); //булевая функция для проверки слона/одного из ходов ферзя

        switch (figure) //смотрим, что закинули в фигуру
        {
            default: //мало ли, случайно не то/ не так вбили :)
                System.out.println("В следющий раз введите действительную фигуру :)");
            case ("rook"): //дальше уже все понятно
                ans= !(firstState != 0 && secondState != 0);
                break;
            case("bishop"):
                ans= oneDirectStates;
                break;
            case("queen"):
                ans=oneDirectStates || !(firstState != 0 && secondState != 0);
                break;
            case("pawn"):
                ans= (firstState==0 && secondState==1);
                break;
            case("king"):
                ans = (firstState < 2) && (secondState < 2);
                break;
            case("knight"):
                ans= (firstState==2 && secondState==1) || (firstState==1 && secondState==2);
                break;
            case(""):
        }
        return ans;
    }
}
