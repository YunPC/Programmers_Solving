import java.util.*;

public class Network {

    //프로그래머스 문제풀이 level3 네트워크
    public static void main(String[] args) {
        int[][] computers = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        int n = 3;
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i < n; i++)
        {
            if(!visited[i])
            {
                answer++;
                visited[i] = true;
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while(!stack.empty())
                {
                    int t = stack.peek();
                    stack.pop();
                    for(int j = 0; j < n; j++)
                    {
                        if(computers[t][j] == 1 && !visited[j])
                        {
                            visited[j] = true;
                            stack.push(j);
                        } 
                            
                    }
                }
            }
        }
    }
    
}
