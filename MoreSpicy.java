import java.util.*;

public class MoreSpicy {

    //프로그래머스 level2 문제풀이 더 맵게

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 0;
        boolean isPossible = true;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int food : scoville)
            pq.add(food);
        while(pq.size() > 1)
        {
            if(pq.peek() >= K)
            {
                isPossible = true;
                break;
            }
            else
            {
                Integer food1 = pq.poll();
                Integer food2 = pq.poll();
                pq.add(food1 + food2*2);
                answer++;
            }
            
        }
        if(pq.peek() < K)
            answer = -1;
        System.out.println(answer);
    }
    
}
