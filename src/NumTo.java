public class NumTo
{
    public static String eng(String s)
    {
        String ans = "";
        boolean flag=false;

        for (int i = 0; i <s.length(); ++i)
        {
            if (s.length()-i!=2)
            {
                switch (s.charAt(i))
                {
                    case ('1'):
                        ans += "one ";
                        break;
                    case ('2'):
                        ans += "two ";
                        break;
                    case ('3'):
                        ans += "three ";
                        break;
                    case ('4'):
                        ans += "four ";
                        break;
                    case ('5'):
                        ans += "five ";
                        break;
                    case ('6'):
                        ans += "six ";
                        break;
                    case ('7'):
                        ans += "seven ";
                        break;
                    case ('8'):
                        ans += "eight ";
                        break;
                    case ('9'):
                        ans += "nine ";
                        break;
                    case ('0'):
                        ans += "zero ";
                        break;
                }
                if (i == 0 && s.length()==3)
                    ans += "hundred ";
            }
            else if (s.length()-i==2)
            {
                switch (s.charAt(i))
                {
                    case ('2'):
                        ans += "twenty ";
                        break;
                    case ('3'):
                        ans += "thirty ";
                        break;
                    case ('4'):
                        ans += "fourty ";
                        break;
                    case ('5'):
                        ans += "fifty ";
                        break;
                    case ('6'):
                        ans += "sixty ";
                        break;
                    case ('7'):
                        ans += "seventy ";
                        break;
                    case ('8'):
                        ans += "eighty ";
                        break;
                    case ('9'):
                        ans += "ninety ";
                        break;
                    case ('1'):
                        switch (s.charAt(i+1))
                        {
                            case ('1'):
                                ans += "eleven";
                                break;
                            case ('2'):
                                ans += "twelve";
                                break;
                            case ('3'):
                                ans += "thirteen";
                                break;
                            case ('4'):
                                ans += "fourteen";
                                break;
                            case ('5'):
                                ans += "fifteen";
                                break;
                            case ('6'):
                                ans += "sixteen";
                                break;
                            case ('7'):
                                ans += "seventeen";
                                break;
                            case ('8'):
                                ans += "eighteen";
                                break;
                            case ('9'):
                                ans += "nineteen";
                                break;
                            case ('0'):
                                ans += "ten";
                                break;
                        }
                        flag=true;
                        break;
                }
                if (s.charAt(i+1)=='0')
                    flag=true;
                if (flag)
                    break;
            }
        }
        return ans;
    }
}