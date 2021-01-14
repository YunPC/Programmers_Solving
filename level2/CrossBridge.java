package level2;
import java.util.*;

public class CrossBridge {

    //프로그래머스 문제풀이 level2 다리를 지나는 트럭

    public static void main(String[] args)
    {
        int bridge_length = 5;
        int weight = 5;
        int[] truck_weights = {2,2,2,2,1,1,1,1,1};
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int item = 0, w = 0, out = 0;
        int in_time = 1;
        while(item < truck_weights.length)
        {
            while((w+truck_weights[item] > weight) 
                    || (q.isEmpty() ? false : in_time >= q.peek()+bridge_length))
            {
                w -= truck_weights[out++];
                in_time = q.poll() + bridge_length;
            }
            q.add(in_time);
            w += truck_weights[item];

            in_time++;
            item++;
        }
        answer = --in_time + bridge_length;
        System.out.println(answer);
    }
    
}
