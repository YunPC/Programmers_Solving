import java.util.*;

public class FunctionDevelope {

    //프로그래머스 level2 문제풀이 기능 개발
    
    public static void main(String[] args)
    {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int r_date;
        for(int i = 0; i < progresses.length; i++)
        {
            r_date = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            q.add(r_date);
        }
        r_date = q.peek();
        int cnt = 0;
        while(!q.isEmpty())
        {
            if(r_date >= q.peek())
            {
                cnt++;
                q.remove();
            } 
            else
            {
                answer.add(cnt);
                cnt = 1;
                r_date = q.poll();
            }
            
        }
        answer.add(cnt);
    }
    
}
