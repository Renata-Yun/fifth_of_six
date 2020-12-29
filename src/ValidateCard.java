public class ValidateCard
{
    public static boolean card(String card)
    {
        if (card.length() < 14 || card.length() > 19)
        {
            System.out.println("Недействительный номер карты");
            return false;
        }
        else
        {
            int sum = 0;
            int number = 0;
            int lastNum = Character.getNumericValue(card.charAt(card.length() - 1));
            card=card.substring(0, card.length()-1);
            card = new StringBuilder(card).reverse().toString();
            for (int i = 0; i < card.length(); ++i)
            {
                if (i % 2 == 0)
                {
                    number = Character.getNumericValue(card.charAt(i)) * 2;
                    if (number / 10 != 0)
                    {
                        sum += number % 10 + number / 10;
                    }
                    else
                        sum += number;
                }
                else
                {
                    sum += Character.getNumericValue(card.charAt(i));
                }
            }
            return (10-sum%10==lastNum);
        }
    }
}
