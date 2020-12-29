import java.util.*;

public class Flip3Digit {
    
    //프로그래머스 문제풀이 level1 3진법 뒤집기
    public static void main(String[] args)
    {
        int n = 45;
        int answer = 0;
        int q = 1, r = 0;
        Stack<Integer> s = new Stack<>();
        while(q != 0)
        {
            q = n/3;
            r = n%3;
            n /= 3;
            s.push(r);
            
        }
        int digit = 0;
        while(!s.empty())
        {
            answer += Math.pow(3,digit) * Integer.parseInt(s.peek().toString());
            digit++;
            s.pop();
        }
        System.out.print(answer);
    }
    
}
