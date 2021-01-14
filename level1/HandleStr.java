
package level1;

public class HandleStr {

    //프로그래머스 문제풀이 level1 문자열 다루기 기본
    public static void main(String[] args)
    {
        String s = "a234";
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6)
        {
            answer = true;
            for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                int ascii = (int)c;
                if(c > 57 || c < 48)
                    answer = false;
            }
                
        }
    }
    
}
