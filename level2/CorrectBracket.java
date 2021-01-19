package level2;

public class CorrectBracket {

    //프로그래머스 문제풀이 level2 올바른 괄호

    public static void main(String[] args) {
        String s = "()()";
        boolean answer = true;
        int open = 0, close = 0;
        char[] arr = s.toCharArray();
        for(char c : arr)
        {
            if(c == '(')
                open++;
            else
                close++;
            if(open < close)
            {
                answer = false;
                break;
            }
        }
        if(open != close)
            answer = false;
            
        System.out.println(answer);
    }
    
}
