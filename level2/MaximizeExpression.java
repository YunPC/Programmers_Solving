package level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximizeExpression {

    //프로그래머스 문제풀이 level2 수식 최대화
    public static void main(String[] args) {
        String expression = "100-200*300-500+20";
        int[] price = new int[6];
        Queue<String> q1 = ReturnPostfix(1, 2, 3, expression);
        Queue<String> q2 = ReturnPostfix(1, 3, 2, expression);
        Queue<String> q3 = ReturnPostfix(2, 1, 3, expression);
        Queue<String> q4 = ReturnPostfix(3, 1, 2, expression);
        Queue<String> q5 = ReturnPostfix(2, 3, 1, expression);
        Queue<String> q6 = ReturnPostfix(3, 2, 1, expression);
        
        price[0] = ReturnPrice(q1);
        price[1] = ReturnPrice(q2);
        price[2] = ReturnPrice(q3);
        price[3] = ReturnPrice(q4);
        price[4] = ReturnPrice(q5);
        price[5] = ReturnPrice(q6);

        int answer = 0;
        for(int n : price)
        {
            if(answer < n)
                answer = n;
        }
        
        System.out.println(answer);
        
    }
    public static int ReturnPriority(int p_rank, int s_rank, int m_rank, char c)
    {
        switch(c){
            case '+':
                return p_rank;
            case '-':
                return s_rank;
            case '*':
                return m_rank;
            default:
                return -1;
        }
    }
    public static Queue<String> ReturnPostfix(int p_rank, int s_rank, int m_rank, String expression)
    {
        Stack<Character> stack = new Stack<>();
        Queue<String> q = new LinkedList<>();
        StringBuilder buff = new StringBuilder();
        for(char c : expression.toCharArray())
        {
            if(c >= 48 && c <=57)
                buff.append(c);
            else
            {
                q.add(buff.toString());
                buff.delete(0, buff.length());
                if(stack.empty())
                    stack.push(c);
                else
                {
                    int rank = ReturnPriority(p_rank, s_rank, m_rank, c);
                    while(!stack.empty() && ReturnPriority(p_rank, s_rank, m_rank, stack.peek()) <= rank)
                    {
                        q.add(String.valueOf(stack.peek()));
                        stack.pop();
                    }
                    stack.push(c);
                }
                
                    
            }
        }
        q.add(buff.toString());
        while(!stack.empty())
        {
            q.add(String.valueOf(stack.peek()));
            stack.pop();
        }
        return q;
    }
    public static int ReturnPrice(Queue<String> q)
    {
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty())
        {
            String s = q.poll();
            try{
                int n = Integer.parseInt(s);
                stack.push(n);
            }catch(NumberFormatException e)
            {
                int n2 = stack.peek();
                stack.pop();
                int n1 = stack.peek();
                stack.pop();
                if(s.equals("+"))
                    stack.push(n1+n2);
                else if(s.equals("-"))
                    stack.push(n1-n2);
                else
                    stack.push(n1*n2);
            }
        }
        return Math.abs(stack.peek());
    }
}
