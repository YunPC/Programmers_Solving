import java.util.Stack;

public class NthGame {
    
    //프로그래머스 문제풀이 level2 n진수 게임
    public static void main(String[] args) {
        int n=2, t=4, m=2, p=1; 
        String answer = "";
        String answer = "";
        int cnt = 0;
        int num = 0;
        int idx = 1;
        while(cnt < t)
        {
            Stack<Integer> stack = new Stack<>();
            int t_num = num;
            do
            {
                stack.push(t_num%n);
                t_num /= n;
                
            }while(t_num > 0);
            
            while(!stack.empty())
            {
                if(p == idx)
                {
                    String add_num = String.valueOf(stack.peek());
                    if(add_num.equals("10"))
                        add_num = "A";
                    else if(add_num.equals("11"))
                        add_num = "B";
                    else if(add_num.equals("12"))
                        add_num = "C";
                    else if(add_num.equals("13"))
                        add_num = "D";
                    else if(add_num.equals("14"))
                        add_num = "E";
                    else if(add_num.equals("15"))
                        add_num = "F";
                    
                    answer += add_num;
                    p += m;
                    cnt++;
                    if(cnt == t)
                        break;
                }
                idx++;
                stack.pop();
            }
            num++;
        }
    }
}
