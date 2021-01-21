package level2;

import java.util.Stack;

public class PairRemove {

    //프로그래머스 문제풀이 Level2 짝지어 제거하기
    public static void main(String[] args) {
        String s = "baabaa";
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(!stack.empty())
            {
                if(stack.peek() == c)
                {
                    stack.pop();
                    continue;
                }
                    
            }
            stack.push(c);
        }
        if(stack.empty())
            answer = 1;

        System.out.println(answer);
    }
    
}
