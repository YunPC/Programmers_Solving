
package level1;

public class CntpCnty {
    
    //프로그래머스 문제풀이 level1 문자열 내 p와 y의 개수
    public static void main(String[] args)
    {
        String s = "pPoooyY";
        boolean answer = true;
        int p = 0, y = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'p')
                p++;
            else if(s.charAt(i) == 'y')
                y++;
        }
        
        if(p!=y)
            answer = false;
    }
}
