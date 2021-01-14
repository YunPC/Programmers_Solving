package level2;
public class ConvertBracket {
    
    //프로그래머스 문제풀이 level2 괄호 변환
    
    public static void main(String[] args) {
        String p = "()))((()";
        String answer = "";

        if(isCorrectBracket(p))
            answer = p;
        else
            answer = ChangeBracket(p);

        System.out.println(answer);
    }
    public static boolean isCorrectBracket(String s)
    {
        char[] arr = s.toCharArray();
        int open = 0;
        int close = 0;
        for(char c : arr)
        {
            if(c == '(')
                open++;
            else
                close++;
            if(close > open)
                return false;
        }
        return true;
            
    }
    public static String ChangeBracket(String s)
    {
        //1. 입력이 빈 문자열인 경우 빈 문자열을 반환합니다.
        if(s.equals(""))
            return "";
        else
        {
            //2. u, v로 분리
            String u = "";
            String v = "";
            char[] arr = s.toCharArray();
            int open = 0;
            int close = 0;
            for(char c : arr)
            {
                if(c == '(')
                    open++;
                else
                    close++;
                if(open == close)
                    break;
            }
            int idx = open*2;
            u = s.substring(0, idx);
            if(idx < s.length())
                v = s.substring(idx);

            String temp = ChangeBracket(v);
            
            //3.u가 올바른 문자열일 경우
            if(isCorrectBracket(u))
                return u + temp;
            //4.u가 올바른 문자열이 아닐 경우
            else
            {
                StringBuilder buff = new StringBuilder();
                //4-1.
                buff.append("(");
                //4-2.
                buff.append(temp);
                //4-3.
                buff.append(")");
                //4-4.
                u = u.substring(1, u.length()-1);
                if(!u.equals(""))
                {
                    char[] array = u.toCharArray();
                    for(int i = 0; i < array.length; i++)
                        array[i] = array[i] == '(' ? ')' : '(';
                    buff.append(array);
                }
                //4-5.
                return buff.toString();
                
            }
            
        }
    }
}
