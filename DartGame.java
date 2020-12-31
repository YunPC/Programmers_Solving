import java.util.*;

public class DartGame {

    //프로그래머스 문제풀이 level1 다트 게임
    public static void main(String[] args)
    {
        String dartResult = "1S2D*3T";
        int answer = 0;
        char[] arr = dartResult.toCharArray();
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0; i < arr.length; i++)
        {  
            if(Character.isDigit(arr[i]))
            {
                int n = Integer.parseInt(String.valueOf(arr[i]));
                if(Character.isDigit(arr[i+1]))
                {
                    n = 10;
                    i++;
                }
                if(arr[i+1] == 'S')
                    s.push(Integer.parseInt(String.valueOf(n)));
                else if(arr[i+1] == 'D')
                    s.push((int)Math.pow(n, 2));
                else
                    s.push((int)Math.pow(n, 3));
            }
            else if(arr[i] == '*')
            {
                if(s.size() == 1)
                {
                    int n = Integer.parseInt(String.valueOf(s.peek()));
                    s.pop();
                    s.push(n*2);
                }
                else
                {
                    int n1 = Integer.parseInt(String.valueOf(s.peek()));
                    s.pop();
                    int n2 = Integer.parseInt(String.valueOf(s.peek()));
                    s.pop();
                    s.push(n2*2);
                    s.push(n1*2);
                }
            }
            else if(arr[i] == '#')
            {
                int n = Integer.parseInt(String.valueOf(s.peek()));
                s.pop();
                s.push(n*(-1));
            }
            
        }
        while(!s.empty())
        {
            answer += s.peek();
            s.pop();
        }
        System.out.print(answer);
    }
    
}
